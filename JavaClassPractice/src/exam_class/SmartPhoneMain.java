package exam_class;

public class SmartPhoneMain {
    public static void main(String[] args) {

        System.out.println("---------------------------");

        SmartPhone sp1 = new SmartPhone("삼성", "갤럭시 S25 엣지", 1639000);
        PhonePrint(sp1);
        SmartPhone sp2 = new SmartPhone("애플", "iPhone 17", 1250000, 10);
        PhonePrint(sp2);
        SmartPhone sp3 = new SmartPhone("삼성", "갤럭시 Z 플립7", 1485000, 5);
        PhonePrint(sp3);

    }

    public static void PhonePrint(SmartPhone sp) {
        System.out.println(sp.getName() + " [" + sp.getMaker() + "]");
        System.out.printf("가격 : %,d원\n", sp.getPrice());
        if(sp.getDiscountRate() != 0) {
            System.out.printf("할인가격(%d%%) : %,d원\n", sp.getDiscountRate(), sp.calculateDiscount());
        }
        System.out.println("---------------------------");
    }
}
