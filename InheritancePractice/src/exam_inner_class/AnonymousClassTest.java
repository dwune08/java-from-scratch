package exam_inner_class;

import exam_interface.RemoteControl;

public class AnonymousClassTest {
    public static void main(String[] args) {
        RemoteControl ac = new RemoteControl() {
            @Override
            public void turnOn() {
                System.out.println("TV 전원 켜기");
            }

            @Override
            public void turnOff() {
                System.out.println("TV 전원 끄기");
            }

            @Override
            public void setVolume(int volume) {
            }
        }; // 이름 없는 클래스 선언
        ac.turnOn();
        ac.turnOff();
    }
}
