package exam_class_static;

public class StaticMethodTest {
    private static int num1 = 5;    // 정적 변수. 클래스 변수 선언
    private int num2 = 3;           // 인스턴스 변수

    public static void print1() {   // 정적 메서드. 클래스 메서드
        int num3 = num1;
        // int num4 = this.num2; // 결과? 에러-num2는 non-static 변수여서 참조할 수 없다.
        System.out.println(num3);
        System.out.println("print1() 호출");
    }

    public void print2() {
        int num3 = num1;
        int num4 = num2;
        System.out.println(num3 + "," + num4);
        System.out.println("print2() 호출");
    }

    public static void main(String[] args) {
        StaticMethodTest.print1();
        print1();

        // StaticMethodTest.print2();  // 에러
        // print2(); // 에러

        StaticMethodTest method = new StaticMethodTest();
        method.print2();
    }

}
