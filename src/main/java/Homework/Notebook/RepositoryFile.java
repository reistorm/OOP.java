package Homework.Notebook;

import java.util.ArrayList;
import java.util.List;

public class RepositoryFile implements Repository {
    private NoteMapper mapper = new NoteMapper();
    private FileOperation fileOperation;

    public RepositoryFile(FileOperation fileOperation) {
        this.fileOperation = fileOperation;
    }

    @Override
    public List<Note> getAllNote() {
        List<String> lines = fileOperation.readAllLines();
        List<Note> notes = new ArrayList<>();
        for (String line : lines) {
            notes.add(mapper.map(line));
        }
        return notes;
    }

    @Override
    public void UpdateNote(Note note, Fields field, String param) {
        if (field == Fields.TITLE) {
            note.setTitle(param);
        } else if (field == Fields.TEXT) {
            note.setText(param);
        }
        saveNote(note);
    }

    private void saveNote(Note note) {
        List<String> lines = new ArrayList<>();
        List<Note> notes = getAllNote();
        for (Note item : notes) {
            if (note.getId().equals(item.getId())) {
                lines.add(mapper.map(item));
            } else {
                lines.add(mapper.map(item));
            }
        }
        fileOperation.saveAllLines(lines);
    }

    @Override
    public void CreateNote(Note note) {
        List<Note> notes = getAllNote();
        int max = 0;
        for (Note item : notes) {
            int id = Integer.parseInt(item.getId());
            if (max < id) {
                max = id;
            }
        }
        int newId = max + 1;
        String id = String.format("%d", newId);
        note.setId(id);
        notes.add(note);
        List<String> lines = new ArrayList<>();
        for (Note item : notes) {
            lines.add(mapper.map(item));
        }
        fileOperation.saveAllLines(lines);

    }

    public void deleteNote(List notes) {
        List<String> lines = new ArrayList<>();
        List<Note> deleteNotes = notes;
        for(Note item : deleteNotes) {
            lines.add(mapper.map(item));
        }
        fileOperation.saveAllLines(lines);
        System.out.println("Заметка удалена");
    }
}
