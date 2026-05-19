package exam_abstract_class;

abstract class Car {

    public abstract void drive();   // 추상 메서드
    public abstract void stop();    // 추상 메서드

    public void startCar() {
        System.out.println("시동을 켭니다.");
    }

    public void turnOff() {
        System.out.println("시동을 끕니다.");
    }

    public final void run() {
        startCar();
        drive();
        stop();
        turnOff();
    }

}