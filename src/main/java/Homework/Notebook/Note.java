package Homework.Notebook;

public class Note {
    private String id;
    private String title;
    private String text;
    private String date;

    public Note(String id, String title, String text, String date) {
        this(title, text, date);
        this.id = id;
    }
    public Note(String title, String text, String date){
        this.title = title;
        this.text = text;
        this.date = date;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return String.format("ID: %s, Title: %s, Text: %s, Data: %s", id, title, text, date);
    }
}
