package exam_for;

/* 2개의 주사위를 던지는 게임이 있다고 가정해 봅시다.
 * 2개 주사위의 합이 6이 되는 경우는 몇 가지나 있을까요?
 * 6이 되는 모든 경우의 수를 출력하는 프로그램을 작성해 주세요.
 * (1,5)
 * ...
 */

public class DiceExample {
    public static void main(String[] args) {

        for(int i = 1; i <= 6; i++) {
            for(int j = 1; j <= 6; j++) {
                if(i+j == 6) System.out.println("(" + i + "," + j + ")");
            }
        }
    }
}
