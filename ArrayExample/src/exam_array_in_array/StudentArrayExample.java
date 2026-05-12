package exam_array_in_array;
import java.util.Scanner;

/* 사용자로부터 3명 학생의 국어, 영어, 수학 성적을 입력받아서
 * 학생별 합계와 평균을 구하는 프로그램을 배열을 이용해서 작성해 주세요.
 */

public class StudentArrayExample {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[][] score = new int[3][4];
        double[] avg = new double[3];
        String[] subject = {"국어", "영어", "수학", "총점", "평균"};

        System.out.println("학생 3명의 국어, 영어, 수학 성적을 각각 입력해주세요.");
        for(int i = 0; i < score.length; i++) {
            for(int j = 0; j < score[i].length-1; j++) {
                System.out.print((i+1) + "번 학생의 " + subject[j] + " 성적 : ");
                score[i][j] = input.nextInt();
                score[i][score[i].length-1] += score[i][j];
            }
            avg[i] = score[i][score[i].length-1]/(double)score.length;
        }
        System.out.println("======== 3명의 학생 데이터 출력 ========");
        for(String k : subject) {
            System.out.print(k + "\t\t");
        }
        System.out.println();
        for(int i = 0; i < score.length; i++) {
            for (int j = 0; j < score[i].length; j++) {
                System.out.print(score[i][j] + "\t\t");
            }
            System.out.printf("%.1f\n", avg[i]);
        }
        input.close();
    }
}
