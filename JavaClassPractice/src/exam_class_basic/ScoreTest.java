package exam_class_basic;
import java.util.Scanner;

public class ScoreTest {
    public static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        char yn;

        System.out.println("학생 성적 계산 프로그램입니다.");

        // 사용자로부터 직접 데이터를 입력 받을지 여부 체크
        while(true) {
            System.out.print("직접 입력하시겠습니까? (y/n) ");
            yn = input.next().charAt(0);
            if (yn == 'y' || yn == 'n') break;
            else System.out.println("잘못 입력하셨습니다.");
        }

        if(yn == 'y') {
            // 사용자로부터 입력받아 출력하는 메서드
            scanCase();
        } else {

            // 문구 출력하는 메서드
            printLetter();

            // 클래스 이용하여 출력
            StudentScore ssc1 = new StudentScore();
            ssc1.inputData("홍길동", 90, 75, 61);
            ssc1.printData();
            StudentScore ssc2 = new StudentScore();
            ssc2.inputData("김철수", 55, 56, 46);
            ssc2.printData();
            StudentScore ssc3 = new StudentScore();
            ssc3.inputData("이진희", 90, 90, 90);
            ssc3.printData();
        }
        input.close();
    }

    // 학생 수, 그리고 데이터를 사용자로부터 입력받는 경우
    public static void scanCase() {
        int studentNum; // 입력받을 학생의 수
        String[] subj = new String[]{"수학", "영어", "국어"}; // 과목들
        while(true) {
            System.out.println("성적을 계산할 학생 수를 입력해주세요.");
            studentNum = input.nextInt();
            input.nextLine();
            if(studentNum > 0) break;
            else System.out.println("잘못 입력하셨습니다. 학생 수는 0명 이상이어야 합니다.");
        }

        String[] names = new String[studentNum];    // 학생들의 이름을 저장할 배열
        int[][] scores = new int[studentNum][3];    // 학생들의 성적들을 저장할 배열

        // 반복문을 사용하여 학생들의 이름과 성적 정보를 입력받음
        for(int i = 0; i < studentNum; i++) {
            System.out.print((i+1) + "번째 학생의 이름 : ");
            names[i] = input.nextLine();
            for(int j = 0; j < 3; j++) {
                System.out.print((i+1) + "번째 학생의 " + subj[j] +" 점수 : ");
                scores[i][j] = input.nextInt();
            }
            input.nextLine();
        }

        // 메서드를 이용해 틀 출력
        printLetter();

        // 학생 수만큼 반복하여 StudentScore 클래스를 이용하여 데이터를 입력하고 출력
        for(int i = 0; i < studentNum; i++) {
            StudentScore ssc = new StudentScore();
            ssc.inputData(names[i], scores[i][0], scores[i][1], scores[i][2]);
            ssc.printData();
        }
        }

    // 기본 문구 출력 메서드
    public static void printLetter() {
        System.out.println("=====================================");
        System.out.println("이름\t\t국어\t영어\t수학\t총점\t평균\t\t학점");
        System.out.println("=====================================");
    }
}
