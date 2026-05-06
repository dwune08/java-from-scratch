package example;

/*[요구사항 3]
 *369게임을 간단히 작성해보자.
 * 1~99까지의 정수를 키보드로부터 입력받고 그 수가 범위에 속하지 않으면
 * "값의 범위를 초과하였습니다." 라고 출력하고 종료한다.
 * 정수에 3, 6, 9 중 하나가 있는 경우는 "박수짝"을 출력하고
 * 두 개 있는 경우는 "박수짝짝"을 출력하는 프로그램을 작성하라.
 *
 * 예를 들면 정수가 13인 경우 "박수짝"을,
 * 36인 경우 "박수짝짝"을 출력하면 된다. */

import java.util.Scanner;

public class ThreeSixNine {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String clap;

        System.out.println("369게임 입니다.");
        System.out.print("1~99까지의 정수를 입력해주세요. ");
        int x = input.nextInt();

        if(x > 99 || x < 1) {
            System.out.println("값의 범위를 초과하였습니다.");
        } else {
            /*
            switch(x/10) {
                case 3,6,9 -> {
                     clap = switch (x%10) {
                        case 3,6,9 -> "박수짝짝";
                        default -> "박수짝";
                    };
                }
                default -> {
                    clap = switch (x%10) {
                        case 3,6,9 -> "박수짝";
                        default -> "";
                    };
                }
            } */
            int i = 0;
            if((x/10)==3||(x/10)==6||(x/10)==9) i++;
            if((x%10)==3||(x%10)==6||(x%10)==9) i++;
            clap = switch (i) {
                case 2 -> "박수짝짝";
                case 1 -> "박수짝";
                default -> "";
            };
            System.out.println(clap);
        }
        input.close();
    }
}
