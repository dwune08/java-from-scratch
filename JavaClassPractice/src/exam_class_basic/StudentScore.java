package exam_class_basic;

public class StudentScore {
    // 필드 정의
    public String studentName;  // 학생 이름
    public int mathScore;       // 수학 점수
    public int engScore;        // 영어 점수
    public int korScore;        // 국어 점수

    // 정보를 입력받는 메서드
    public void inputData(String n, int m, int e, int k) {
        studentName = n;
        mathScore = m;
        engScore = e;
        korScore = k;
    }

    // 총점을 구하는 메서드
    public int totalScore() {
        return mathScore+engScore+korScore;
    }

    // 평균을 구하는 메서드
    public double average() {
        return (double) totalScore() / 3.0;
    }

    // 학점을 구하는 메서드
    public char grade() {
        return switch ((int)average()/10) {
            case 10, 9 -> 'A';
            case 8 -> 'B';
            case 7 -> 'C';
            case 6 -> 'D';
            default -> 'F';
        };
    }

    // 정보를 출력하는 메서드
    public void printData() {
        System.out.printf("%s\t%d\t%d\t%d\t%d\t%.1f\t%c\n", studentName, mathScore, engScore, korScore, totalScore(), average(), grade());
    }
}