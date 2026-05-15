package exam_class;

public class FruitTest {
    public static void main(String[] args) {
        Fruit[] fruit = new Fruit[]{
                new Fruit("banana", 4800),
                new Fruit("strawberry", 21000),
                new Fruit("persimmon", 19000),
                new Fruit("cherry", 12000)
        };
        System.out.println("==========과일구입 목록==========");
        for(int i = 0; i < fruit.length; i++) {
            fruit[i].printData();
        }
        System.out.println("------------------------------");
        Fruit.printDiscountPrice(15);
    }
}