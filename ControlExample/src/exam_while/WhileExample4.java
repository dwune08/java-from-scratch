package exam_while;
import java.util.Scanner;

/* 사용자로부터 두 개의 값을 입력받아 그 사이의 숫자를 모두 출력하세요.
 * 1 미만의 숫자가 입력됐다면 "1 이상의 숫자를 입력해주세요"가 출력되면서
 * 다시 사용자가 값을 입력하도록 하세요. */

public class WhileExample4 {
    public static void main(String[] args) {
        int num1, num2;
        Scanner input = new Scanner(System.in);

        while(true){
            System.out.print("첫 번째 숫자 : ");
            num1 = input.nextInt();
            System.out.print("두 번째 숫자 : ");
            num2 = input.nextInt();

            if((num1 >= 1)&&(num2 >= 1)) break;
            else System.out.println("1 이상의 숫자를 입력해주세요.");
        }
        if(num1 > num2) { // num1를 작은 수, num2를 큰수로 재배치.
            int temp = num1;
            num1 = num2;
            num2 = temp;
        }
        while(num1 <= num2) { // num1를 1씩 증가시키며 num2와 같아질 때까지 반복 수행
            System.out.print(num1++ + " ");
        }
        input.close();
    }
}
