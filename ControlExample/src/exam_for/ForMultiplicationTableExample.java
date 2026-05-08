package exam_for;

/* 구구단 2단부터 9단까지 출력하기
 * 2 x 1 =  2
 * ...
 * 9 x 9 = 81
 *
 * 2 x 1 =  2 3 x 1 =  3 ...
 * ...
 * 2 x 9 = 18 3 x 9 = 27 ...
 */

public class ForMultiplicationTableExample {
    public static void main(String[] args) {

        for(int m = 2; m <= 9; m++) {
            for(int n = 1; n <= 9; n++) {
                System.out.printf("%d x %d = %2d\n", m, n, m*n);
            }
            System.out.println();
        }
        System.out.println();

        for(int m = 1; m <= 9; m++) {
            for(int n = 2; n <= 9; n++) {
                System.out.printf("%d x %d = %2d  ", m, n, m*n);
            }
            System.out.println();
        }
    }
}
