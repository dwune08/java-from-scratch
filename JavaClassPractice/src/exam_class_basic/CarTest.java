package exam_class_basic;

public class CarTest {
    public static void main(String[] args) {
        // 클래스명 참조변수 = new 클래스명();
        Car myCar = new Car(); // 첫 번째 객체 생성

        // 각각의 필드에 값을 설정해 주는 방법 - 참조변수명.필드 = 값
        /*
        myCar.speed = 0;        // 객체의 필드 변경
        myCar.gear = 1;         // 객체의 필드 변경
        myCar.color = "red";    // 객체의 필드 변경
        */

        myCar.carData(0, 1, "red");

        // 객체의 메소드 호출 - 참조변수명.메서드()
        myCar.speedUp();
        myCar.printData();                      // 출력방법 1
        System.out.println(myCar.toString());   // 출력방법 2
        System.out.println();

        Car yourCar = new Car();    // 두 번째 객체 생성

        /*
        yourCar.speed = 30;         // 객체의 필드 변경
        yourCar.gear = 3;           // 객체의 필드 변경
        yourCar.color = "blue";     // 객체의 필드 변경
        */

        yourCar.carData(30, 3, "blue");

        yourCar.speedDown();    // 객체의 메소드 호출
        yourCar.printData();    // 출력방법 1
        System.out.println(yourCar.toString());
    }
}
