package exam_class_constructor;

public class CarConstructorTest {
    public static void main(String[] args) {
        CarConstructor c1 = new CarConstructor();
        System.out.printf("자동차 정보 [속도=%-2d, 기어=%d, 색상=%s]\n",
                c1.getSpeed(), c1.getGear(), c1.getColor());
        CarConstructor c2 = new CarConstructor(60, 1, "blue");
        System.out.println(c2.toString());
    }
}
