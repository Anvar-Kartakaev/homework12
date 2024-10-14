public class Book {
    private String title;
    private Author author;
    private int publisher;

    public Book(String title, Author author, int publisher) {
        this.title = title;
        this.author = author;
        this.publisher = publisher;
    }

    public String getTitle() {
        return this.title;
    }

    public Author getAuthor() {
        return this.author;
    }

    public int getPublisher() {
        return this.publisher;
    }

    public void setPublisher(int publisher) {
        this.publisher = publisher;
    }
}
