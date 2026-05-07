package exam_dowhile;
import java.util.Scanner;

/* 이 예제는 숫자 알아맞히기 게임이다.
 * 프로그램은 1부터 10사이의 정수를 저장하고
 * 사용자는 질문을 통하여 그 정수를 알아맞히려고 노력한다.
 * 사용자가 답을 제시하면 프로그램은 자신이 저장한 정수와 비교하여
 * 제시된 정수가 더 높은지 낮은지만을 알려준다.
 * 프로그램은 do ~ while 루프를 사용하여
 * 사용자가 정확하게 정수를 알아맞힐 때까지 반복한다.
 * 사용자가 정답을 알아맞히면 몇 번 만에 알아맞혔는지는 화면에 출력한다.
 */

public class NumberGame {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int answer, count = 0;

        System.out.println("*** 숫자 알아맞히기 게임입니다. ***");
        System.out.println("1~10 범위의 정수를 맞혀주세요.");
        int goal = (int)(Math.random() * 10 + 1);

        do {
            System.out.print("숫자를 입력해주세요 : ");
            answer = input.nextInt();
            count++;
            if(answer > goal) System.out.println("다운");
            if(answer < goal)  System.out.println("업");
        } while(answer != goal);

        System.out.println("정답입니다! " + count + "회만에 정답을 맞히혔습니다.");
        input.close();
    }
}
