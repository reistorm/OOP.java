package Homework.Notebook;


import java.util.Date;
import java.util.Scanner;

public class ViewNote {
    private final NoteController noteController;

    public ViewNote(NoteController noteController) {
        this.noteController = noteController;
    }

    public void run() {
        Commands com;
        showHelp();
        while(true) {
            try {
                String command = prompt("Введите команду: ");
                com = Commands.valueOf(command.toUpperCase());
                if(com == Commands.EXIT)
                    return;
                switch (com) {
                    case CREATE -> create();
                    case READ -> read();
                    case UPDATE -> update();
                    case HELP -> showHelp();
                    case DELETE -> delete();
                    case LIST -> list();
                }
            }
            catch (Exception ex) {
                System.out.println("Произошла ошибка " + ex);
            }
        }
    }
    private void create() throws Exception {
        String title = prompt("Введите заголовок заметки: ");
        String text = prompt("Введите текст заметки: ");
        String date = new Date().toString();
        noteController.saveNote(new Note(title, text, date));
    }
    private void read() throws Exception {
        String id = prompt("Введите id заметки: ");
        Note note_ = noteController.readNote(id);
        System.out.println(note_);
    }
    public void update() throws Exception {
        String noteId = prompt("Введите Id заметки");
        String field_note = prompt("Какое поле: TITLE, TEXT ".toUpperCase());
        String param = prompt("Введите новые данные: ");
        Note _note = noteController.readNote(noteId);
        noteController.updateNote(_note, Fields.valueOf(field_note.toUpperCase()), param);

    }
    private void showHelp() {
        System.out.println("Список команд:");
        for(Commands c : Commands.values()) {
            System.out.println(c);
        }
    }
    private void delete() throws Exception {
        String noteId = prompt("Введите идентификатор пользователя: ");
        System.out.println(noteController.readNote(noteId));
        String yes = prompt("Для удаления пользователя введите YES")
                .toUpperCase();
        if(yes.equals("YES")) {
            System.out.println("Запись удалена");
            noteController.deleteNote(noteId);
        }
        else {
            System.out.println("Удаление отменено");
        }
    }
    private void list() throws Exception{
        for(Note note : noteController.getNotes()) {
            System.out.println(note);
        }
    }
    private String prompt(String message) {
        Scanner in = new Scanner(System.in);
        System.out.print(message);
        return in.nextLine();
    }





}
