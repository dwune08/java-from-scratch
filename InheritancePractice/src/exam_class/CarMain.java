package exam_class;

public class CarMain {
    public static void main(String[] args) {

        System.out.println("======================== Monata 생산시작 =========================");
        Monata m1 = new Monata("흰색", 5000, "승용", "NF");
        System.out.println(m1.toString());
        Monata m2 = new Monata("은색", 7000, "업무", "Brilliant");
        System.out.println(m2.toString());
        Monata m3 = new Monata("감홍색", 4000, "택시", "EF");
        System.out.println(m3.toString());
        Monata m4 = new Monata("검정색", 6000, "승용", "Hybrid");
        System.out.println(m4.toString());

    }
}
