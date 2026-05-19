package exam_interface;

public class TelevisionTest {
    public static void main(String[] arg) {
        // RemoteControl rc = new RemoteControl();
        // 인터페이       참조변수 = new 생성자() x

        Television tv = new Television();
        tv.turnOn();
        tv.setVolume(20);
        System.out.println(tv.toString());
        tv.setMute(true);
        tv.turnOff();
        RemoteControl.changeBattery();
        System.out.println();

        // Radio 클래스의 인스턴스 생성
        Radio radio = new Radio("표준FM (MHz)", 95.9);
        radio.turnOn();
        radio.setVolume(10);
        radio.printRF();
        System.out.println(radio.toString());
        radio.turnOff();
        System.out.println();

        // SmartTelevision 클래스의 인스턴스 생성
        SmartTelevision smart = new SmartTelevision();
        smart.turnOn();
        smart.search("http://www.naver.com(네이버)");
        smart.turnOff();
    }
}