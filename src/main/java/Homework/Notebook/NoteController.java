package Homework.Notebook;

import java.util.List;

public class NoteController {
    private final Repository repository;

    public NoteController(Repository repository) {
        this.repository = repository;
    }

    public void saveNote(Note note) throws Exception {
        repository.CreateNote(note);
    }

    public void updateNote(Note note, Fields fields, String param) throws Exception{
        if(fields == Fields.TEXT) {
            System.out.println("Заметка обновлена");
        }
        repository.UpdateNote(note, fields, param);
    }

    public Note readNote(String noteId) throws Exception {
        List<Note> notes = repository.getAllNote();
        for(Note note : notes) {
            if(note.getId().equals(noteId)) {
                return note;
            }
        }
        throw new Exception("Заметка не найдена");
    }

    public Note deleteNote(String noteId) throws Exception {
        List<Note> notes = repository.getAllNote();
        for(Note note : notes) {
            if(note.getId().equals(noteId)) {
                notes.remove(note);
                repository.deleteNote(notes);
                return note;
            }
        }
        throw new Exception("Запись не найдена");
    }

    public List<Note> getNotes() throws Exception {
        return repository.getAllNote();
    }

}
