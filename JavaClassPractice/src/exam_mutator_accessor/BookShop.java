package exam_mutator_accessor;

/* 책을 관리하는 BookShop 클래스를 만든다.
 * 클래스는 책제목(title), 저자(author), 책 가격(price)을 필드로 가진다.
 * 각 필드는 설정자와 접근자를 생성한다.
 * 그리고 필드에 값을 대입하기 위한 메서드도 생성한다.
 */

public class BookShop {
    // 필드 선언
    private String title;   // 책 제목
    private String author;  // 책 저자
    private int price;      // 책 가격

    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }
    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPrice() {
        return price;
    }
    public void setPrice(int price) {
        this.price = price;
    }

    public void bookShopData(String title, String author, int price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public String toString() {
        return String.format("책이름: %s\n저자 : %s\n가격 : %d", title, author, price);
    }
}
