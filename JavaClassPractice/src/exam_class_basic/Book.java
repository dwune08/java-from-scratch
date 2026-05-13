package exam_class_basic;

public class Book {
    // 필드 정의
    public String bookNumber;   // 책번호
    public String bookName;     // 책제목
    public String bookPublisher; // 출판사명
    public int bookPrice;       // 책가격

    // 메서드 정의 - 필드값을 설정해 주기 위한 메서드
    public void bookData(String number, String name, String publisher, int price) {
        bookNumber = number;
        bookName = name;
        bookPublisher = publisher;
        bookPrice = price;
    }

    // 메서드 정의 - 필드값을 출력하기 위한 메서드
    public String toString() {
        return String.format("책번호: %s\n책 이름: %s\n출판사명: %s\n책가격: %,d원\n",
                bookNumber, bookName, bookPublisher, bookPrice);
    }
}
