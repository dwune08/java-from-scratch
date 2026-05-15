package exam_class_array;

import java.sql.SQLSyntaxErrorException;

public class Book {
    private String bookName;
    private String author;

    // 디폴트 생성자
    public Book() {    }

    // 생성자(매개변수를 가진 생성자)
    public Book(String bookName, String author) {
        this.bookName = bookName;
        this.author = author;
    }

    // 접근자(Getter, 필드의 값을 반환하는 메서드)
    public String getBookName() {
        return bookName;
    }
    // 설정자(Setter, 필드의 값을 저장(대입, 설정)하는 메서드)
    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void showBookInfo() {
        System.out.println(bookName + ", " + author);
    }

    public String toString() {
        return bookName + ", " + author;
    }
}
