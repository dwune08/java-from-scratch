package exam_while;
import java.util.Scanner;
public class SwitchExample2 {
    public static void main(String[] args) {
        int score;
        char grade;

        Scanner input = new Scanner(System.in);
        System.out.print("점수는 0~100 사이로 입력해 주세요. ");
        score = input.nextInt();

        while(score < 0 || score > 100) {
            System.out.print("점수는 0~100 사이로 입력해 주세요. ");
            score = input.nextInt();
        }

        System.out.printf("점수 = %d ", score);

        // 조건식에는 비교대상(변수, 연산식).. 89/10 => 8.9
        // => 정수/정수이므로 결과도 정수 => 8
        switch(score / 10) {
            case 10: case 9:
                grade = 'A';
                break;
            case 8:
                grade = 'B';
                break;
            case 7:
                grade = 'C';
                break;
            case 6:
                grade = 'D';
                break;
            default:
                grade = 'F';
                break;
        }
        /* 향상된 switch문
        char grade = switch(score / 10) {
            case 10, 0 -> 'A';
            case 8 -> 'B';
            case 7 -> 'C';
            case 6 -> 'D';
            default -> 'F';
        }; */
        System.out.printf("학점 = %c", grade);
        input.close();
    }
}
