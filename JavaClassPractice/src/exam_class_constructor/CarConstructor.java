package exam_class_constructor;

public class CarConstructor {
    private int speed;      // 속도
    private int gear;       // 기어
    private String color;   // 색상

    // 생성자
    public CarConstructor() {
        this(0, 1, "red");
    }

    // 생성자
    public CarConstructor(int speed, int gear, String color) {
        this.speed = speed;
        this. gear = gear;
        this.color = color;
    }

    public int getSpeed() {
        return speed;
    }

    public int getGear() {
        return gear;
    }

    public String getColor() {
        return color;
    }

    public String toString() {
        return "자동차 정보 [속도=" + speed + ", 기어=" + gear + ", 색상=" + color + "]";
    }
}

