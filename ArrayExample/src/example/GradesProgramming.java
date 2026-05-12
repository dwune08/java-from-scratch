package example;

public class GradesProgramming {
    public static void main(String[] args) {
        final String[] name = {"홍길동", "김철수", "이진희"}; // 학생 이름
        final int[][] score = {{90,75,61}, {55,56,46}, {90,90,90}}; // 학생 점수들
        double[][] avg = new double[2][3]; // 총점과 평균을 저장할 배열
        char[] grade = new char[3]; // 학점을 저장할 배열
        String[] pass = new String[3]; // 재수강 여부 저장할 배열
        int[] rank = new int[]{3,3,3}; // 순위 저장할 배열

        System.out.println("\t\t\t\t성적 프로그램");
        System.out.println("==============================================================");
        System.out.println("번호\t이름 \t국어\t영어\t수학\t총점\t평균\t\t학점\t재수강\t\t순위");
        System.out.println("==============================================================");
        for(int i = 0; i < score.length; i++) {
            for(int j = 0; j < score[i].length; j++) {
                avg[0][i] += score[i][j]; //avg[o]행에 총점을 저장, score[i][j]를 더해넣는다.
            }
            avg[1][i] = avg[0][i]/3.00; // avg[i]행에 평균을 저장, 총점으로 부터 계산한다.

           //학점 판별 및 grade[]에 저장
            grade[i] = switch ((int)(avg[1][i]/10)) {
                case 10, 9 -> 'A';
                case 8 -> 'B';
                case 7 -> 'C';
                case 6 -> 'D';
                default -> 'F';
            };

            //재수강 여부 판별, switch-case문에서 함께 처리도 가능하나 지저분해서 분리
            if(avg[1][i] >= 60) pass[i] = "pass";
            else pass[i] = "non-pass";
        }

        // 순위 판별, 각각에게 인원수와 동일한 rank값을 부여하고,
        // 자기보다 낮은 점수 상대 1인당 1씩 감소시켜 순위를 계산한다.
        for(int i = 0; i < rank.length; i++) {
            for(int j = 0; j < rank.length; j++) {
                if(avg[0][i] > avg[0][j]) rank[i]--;
            }
        }

        //최종 출력
        for(int i = 0; i < score.length; i++) {
            System.out.printf("%d\t%s\t",  i+1, name[i]);
            for(int j = 0; j < score[i].length; j++) {
                System.out.printf("%d\t", score[i][j]);
            }
            System.out.printf("%d\t%.2f\t%c\t%-10s\t%d\n", (int)avg[0][i], avg[1][i], grade[i], pass[i], rank[i]);
        }
    }
}
