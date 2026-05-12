package exam_array_in_array;

/* 다음 프로그램은 3년 동안의 분기 강수량을 다음의 데이터를 화룡ㅇ하여 초기화하고,
 * 연도별 강수량과 합을 출력하는 프로그램을 작성하시오.
 *
 *      0열      1열      2열       3열      4열(총합)
 *  0행 368.1    586.5    351.2    66.5     0        <- 2018년도 데이터
 *  1행 173.9    493      448.4     168.1    0        <- 2019년도 데이터
 *  2행 172.8    1012.4   259.4    46.7     0        <- 2020년도 데이터
 */

public class Rainfall {
    public static void main(String[] args) {
        final int YEARS = 3;  // 3년
        final int QUARTERS = 5; // 4분기 + 총합

        // 기상청 데이터를 활용하여 2차원 배열 초기화
        double[][] rain = new double[][] {
                {368.1, 586.5, 351.2, 66.5, 0},
                {173.9, 493, 448.4, 168.1, 0},
                {172.8, 1012.4, 259.4, 46.7, 0}
        };

        for(int y = 0; y < YEARS; y++) {
            for(int q = 0; q < QUARTERS-1; q++) {
                rain[y][QUARTERS-1] += rain[y][q];
                //rain[y][QUARTERS-1] = rain[y][QUARTERS-1] + rain[y][q];
                //rain[행][열 마지막 인덱스] = rain[행][열 마지막 인덱스] + 분기별 강수량;
                //rain[행][4] = rain[행][4] + 분기별 강수량;
            }
        }
        String[] year = {"2018", "2019", "2020"};
        //System.out.println("년도\t1분기\t2분기\t3분기\t4분기\t총합");

        String[] subject = {"년도 ", "1분기", "2분기", "3분기", "4분기", "총합"};
        for(String sub : subject) {
            System.out.printf("%s\t", sub);
        }
        System.out.println("\n----------------------------------------------");
        for(int y = 0; y < YEARS; y++) {
            System.out.print(year[y]+"년도\t");
            for(int q = 0; q < QUARTERS; q++) {
                System.out.printf("%.1f\t", rain[y][q]);
            }
            System.out.println();
        }
    }
}
