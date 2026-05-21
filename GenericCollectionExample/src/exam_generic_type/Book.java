package exam_generic_type;

public class Book {
    private String title;
    private String writer;

    public Book() {
    }

    public Book(String writer, String title) {
        this.writer = writer;
        this.title = title;
    }

    @Override
    public String toString() {
        return "Book [title=" + title + ", writer=" + writer + "]";
    }
}
