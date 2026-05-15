package exam_class_constructor;

public class Book {
    private String title;
    private String author;

    public Book() {
        this("", "");
        // 각 필드의 값을 null이 아닌 ""빈문자로 초기화
    }

    public Book(String title) {
        this(title, "작자 미상");
        System.out.print("매개변수가 하나인 생성자\n");
    }

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
        System.out.print("매개변수가 두개인 생성자\n");
    }

    public String toString() {
        return "책제목 : " + title + " 책저자 : " + author;
    }
}
