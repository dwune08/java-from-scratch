package exam_class_basic;

public class Car {
    // 필드 정의
    public int speed; // 속도
    public int gear; // 기어 단수
    public String color; // 색상

    public void carData(int s, int g, String c) {
        speed = s;
        gear = g;
        color = c;
    }

    public void speedUp() { // 속도 증가 메소드.
        speed += 10;
    }

    public void speedDown() { // 속도 감소 메소드
        speed -= 10;
    }

    public void printData() {
        // 객체의 상태를 문자열로 출력하는 메소드
        System.out.println("속도: " + speed + " 기어 : " + gear + " 색상 : " + color);
    }

    public String toString() {
        // 객체의 상태를 문자열로 반환하는 메소드
        return "속도: " + speed + " 기어 : " + gear + " 색상 : " + color;
    }
}
