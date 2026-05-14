package exam_mutator_accessor;

public class CarMutatorAccessor {
    // 필드 정의
    private int speed;      // 속도
    private int gear;       // 기어 단수
    private String color;   // 색상

    // 접근자(getter) : private으로 선언된 필드의 값을 반환하는 메서드
    // public 자료형 get필드명() { return 필드명; }
    public int getSpeed() {
        return speed;
    }

    // 설정자(setter) : private으로 선언된 필드의 값을 설정하는 메서드
    public void setSpeed(int speed) {
        if (speed > 0)
            this.speed = speed;
        else
            this.speed = 0;
    }

    public int getGear() {
        return gear;
    }

    public void  setGear(int gear) {
        this.gear = gear;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void carData(int speed, int gear, String color) {
        this.speed = speed;
        this.gear = gear;
        this.color = color;
    }

    // 메서드 정의
    public void speedUp(int s) { // 속도 증가 메서드
        speed += s;
    }

    public void speedDown(int s) {
        speed -= s;
    }

    public String toString() {
        return "자동차 상태정보 [ 속도: " + speed + " 기어: " + gear + " 색상: " + color + " ]";
    }
}
