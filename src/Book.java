public class Book {
    private String title;
    private int pages;

    public Book() {
        title = "untitled";
        pages = -1;
    }
    public Book(String title) {
        this.title = title;
        pages = -1;
    }
    public Book(String title, int pages) {
        this.title = title;
        this.pages = pages;
    }

    public int getPages() {
        return pages;
    }

    public String getTitle() {
        return title;
    }

    public String toString() {
        return this.title + ", pages "+ this.pages;
    }

    public String read() {
        return "I am reading " + this.title + ". It has " + this.pages + "pages!";
    }
}
