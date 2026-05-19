package exam_interface;

import java.security.PrivateKey;

public class Radio implements RemoteControl {
    private int volume;
    private String standard;
    private double radioFrequency;

    public Radio(String standard, double radioFrequency) {
        this.standard = standard;
        this.radioFrequency = radioFrequency;
    }

    @Override
    public void turnOn() {
        // 실제로 라디오의 전원을 켜기 위한 코드 작성
        System.out.println("라디오 켜기");
    }

    @Override
    public void turnOff() {
        // 실제로 라디오의 전원을 끄기 위한 코드 작성
        System.out.println("라디오 끄기");
    }

    @Override
    public void setVolume(int volume) {
        if(volume > RemoteControl.MIN_VOLUME) {
            this.volume = RemoteControl.MAX_VOLUME;
        } else if(volume < RemoteControl.MIN_VOLUME) {
            this.volume = RemoteControl.MIN_VOLUME;
        } else {
            this.volume = volume;
        }
    }

    public void printRF() {
        System.out.printf("현재 주파수 선택은 %s %.1f MHz(KHz) 입니다.\n", standard, radioFrequency);
    }

    public String toString() {
        return "현재 라디오 볼륨: " + volume;
    }
}
