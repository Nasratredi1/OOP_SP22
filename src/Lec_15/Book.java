package Lec_15;

public class Book {
    private int id;
    private String title;

    public Book(){

    }

    public Book(int id, String title) {
        this.setId(id);
        this.setTitle(title);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
