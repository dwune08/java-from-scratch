package exam_polymorphism;

class A {
    int a = 10;

    void b() {
        System.out.println("A");
    }
}

class AA extends A {
    int a = 20;

    @Override
    void b() {
        System.out.println("AA");
    }

    void c() {
        System.out.println("C");
    }
}

class BB extends A {
    int a = 30;

    @Override
    void b() {
        System.out.println("BB");
    }

    void d() {
        System.out.println("D");
    }

}

public class ClassTest {
    public static void main(String[] args) {
        // A a1 = new A();
        // AA a2 = new AA();

        A z = new AA();         // AA 객체를 생성하여 A 타입 참조 변수에 대입. 업캐스팅
        System.out.println(z.a);// 참조 변수 타입인 A 클래스의 필드 a에 접근.
        z.b();                  // 메서드는 오버라이딩되므로 실체 객체 타입인 AA클래스이 b()
        System.out.println();

        //z.c();                // 컴파일 오류 : A 타입 참조변수로는 AA 클래스에서만 선언도니 C() 사용 불가

        ((AA)z).c();            // AA 타입으로 다운캐스팅하여 c()를 호출.
        System.out.println(((AA)z).a); // 다운캐스팅 후에는 AA 클래스의 필드 a에 접근

        AA a1 = (AA) z;                 // 다운캐스팅한 객체를 AA 타입 참조변수에 저장.
        // AA 타입 참조변수이므로 AA 클래스의 필드와 메서드에 접근.
        System.out.println(a1.a);
        a1.c();
        System.out.println();

        z = new BB();
        System.out.println(z.a);
        z.b();
        System.out.println();
        //z.d(); // 컴파일 오류

        ((BB) z).d();
        System.out.println(((BB)z).a);

        BB b1 = (BB)z; // 다운캐스팅
        b1.d();
        System.out.println(b1.a);
    }
}
