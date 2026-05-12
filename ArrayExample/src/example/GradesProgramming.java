package example;

public class GradesProgramming {
    public static void main(String[] args) {
        final String[] NAME = {"홍길동", "김철수", "이진희"};
        final int[][] SCORE = {{90,75,61}, {55,56,46}, {90,90,90}};
        double[][] avg = new double[2][3];
        char[] grade = new char[3];
        String[] pass = new String[3];
        int[] rank = new int[]{3,3,3};

        System.out.println("성적 프로그램");
        System.out.println("==============================================================");
        System.out.println("번호\t이름 \t국어\t영어\t수학\t총점\t평균 \t학점\t재수강\t순위");
        System.out.println("==============================================================");
        for(int i = 0; i < SCORE.length; i++) {
            for(int j = 0; j < SCORE[i].length; j++) {
                avg[0][i] += SCORE[i][j];
            }
            avg[1][i] = avg[0][i]/3.00;
            grade[i] = switch ((int)(avg[1][i]/10)) {
                case 10, 9 -> 'A';
                case 8 -> 'B';
                case 7 -> 'C';
                case 6 -> 'D';
                default -> 'F';
            };
            if(avg[1][i] >= 60) pass[i] = "pass";
            else pass[i] = "nopass";
        }
        for(int i = 0; i < rank.length; i++) {
            for(int j = 0; j < rank.length; j++) {
                if(avg[0][i] > avg[0][j]) rank[i]--;
            }
        }

        for(int i = 0; i < SCORE.length; i++) {
            System.out.printf("%d\t%s\t",  i+1, NAME[i]);
            for(int j = 0; j < SCORE[i].length; j++) {
                System.out.printf("%d\t", SCORE[i][j]);
            }
            System.out.printf("%d\t%.2f\t%c\t%s\t%d\n", (int)avg[0][i], avg[1][i], grade[i], pass[i], rank[i]);
        }
    }
}
