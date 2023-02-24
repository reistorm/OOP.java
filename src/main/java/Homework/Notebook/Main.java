package Homework.Notebook;

public class Main {
    public static void main(String[] args) {
        FileOperation fileOperation = new FileOperationImpl("C:\\Users\\Родион\\Desktop\\Элиза\\OOP\\src\\main\\java\\Homework\\Notebook\\notes.txt");
        Repository repository = new RepositoryFile(fileOperation);
        NoteController noteController = new NoteController(repository);
        ViewNote view = new ViewNote(noteController);
        view.run();
    }
}
