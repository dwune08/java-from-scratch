package exam_class_relation;

public class Time {
    private int hour;   // 0 - 23
    private int minute; // 0 - 59
    private int second; // 0 - 59

    // 기본 생성자
    public Time() {
    }

    // 매개변수가 있는 생성자
    public Time(int hour, int minute, int second) {
        setTime(hour, minute, second);
    }

    // 시간 설정 메서드
    public void setTime(int hour, int minute, int second) {
        this.hour = isValidHour(hour) ? hour : 0;
        this.minute = isValidMinuteOrSecond(minute) ? minute : 0;
        this.second = isValidMinuteOrSecond(second) ? second : 0;
    }

    // 시 유효성 검사
    private boolean isValidHour(int hour) {
        return hour >= 0 && hour < 24;
    }

    // 분, 초 유효성 검사
    private boolean isValidMinuteOrSecond(int value) {
        return value >= 0 && value < 60;
    }

    // "시:분:초" 형식으로 반환
    public String toString() {
        return String.format("%02d:%02d:%02d", hour, minute, second);
    }
}
