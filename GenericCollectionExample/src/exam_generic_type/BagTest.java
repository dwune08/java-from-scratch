package exam_generic_type;

public class BagTest {
    public static void main(String[] args) {
        Bag<Book> bag1 = new Bag<>(new Book("마음의 세탁소", "황웅근"));
        Bag<PencilCase> bag2 = new Bag<>(new PencilCase("룬룬필통", "시크그레이"));
        Bag<Notebook> bag3 = new Bag<>(new Notebook("모닝글로리", "A4"));

        bag1.showType();
        bag2.showType();
        bag3.showType();
        System.out.println();

        System.out.println(bag1.getItem().toString());
        System.out.println(bag2.getItem().toString());
        System.out.println(bag3.getItem().toString());


    }
}
