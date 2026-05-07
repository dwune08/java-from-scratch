package exam_while;
import java.util.Scanner;

/* while 문을 이용한 구구단 출력 프로그램
 * [실행결과]
 *  구구단 중에서 출력하고 싶은 단을 입력하시오: 4
 *  4*1=4
 *  ...
 *  4*9=36
 */

public class GugudanExample {
    public static void main(String[] args) {
        int dan;
        int i = 0;
        Scanner input = new Scanner(System.in);

        do {
            System.out.print("구구단 중에서 출력하고 싶은 단(2~9)을 입력하시오: ");
            dan = input.nextInt();
        } while (dan < 2 || dan > 9);

        while(i++ < 9) {
            //System.out.println(dan + "*" + i + "=" + (dan * i));
            System.out.printf("%d*%d=%d\n", dan, i, (dan*i));
        }
        input.close();
    }
}
