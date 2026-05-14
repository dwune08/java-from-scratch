package exam_mutator_accessor;

public class Book {
    private String title;
    private int price;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String toString() {
        return String.format("책제목 : %s, 책가격 : %,d원\n", title, price);
    }
}
