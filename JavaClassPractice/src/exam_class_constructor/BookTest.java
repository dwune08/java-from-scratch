package exam_class_constructor;

public class BookTest {
    public static void main(String[] args) {
        Book littlePrince = new Book("어린왕자", "생텍쥐페리");
        System.out.println(littlePrince.toString());
        System.out.println();

        Book loveStory = new Book("장화홍련전");
        System.out.println(loveStory.toString());
    }
}
