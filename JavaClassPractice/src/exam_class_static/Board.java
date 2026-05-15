package exam_class_static;

public class Board {
    private static int no;
    private String title;
    private String writer;

    public Board() { }
    public Board(String title, String writer) {
        this.title = title;
        this.writer = writer;
        ++no;
    }

    public static int getNo() {
        return no;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getWriter() {
        return writer;
    }

    public void setWriter(String writer) {
        this.writer = writer;
    }

    public String toString() {
        return no + ". " + title + " " + writer;
    }
}

