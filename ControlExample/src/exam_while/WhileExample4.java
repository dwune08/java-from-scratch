package exam_while;
import java.util.Scanner;

/* 사용자로부터 두 개의 값을 입력받아 그 사이의 숫자를 모두 출력하세요.
 * 1 미만의 숫자가 입력됐다면 "1 이상의 숫자를 입력해주세요"가 출력되면서
 * 다시 사용자가 값을 입력하도록 하세요. */

public class WhileExample4 {
    public static void main(String[] args) {
        int i, j;
        Scanner input = new Scanner(System.in);

        System.out.print("첫 번째 숫자 : ");
        i = input.nextInt();
        System.out.print("두 번째 숫자 : ");
        j = input.nextInt();

        while((i<1)||(j<1)){
            System.out.println("1 이상의 숫자를 입력해주세요.");
            System.out.print("첫 번째 숫자 : ");
            i = input.nextInt();
            System.out.print("두 번째 숫자 : ");
            j = input.nextInt();
        }
        if(i > j) { // i를 작은 수, j를 큰수로 재배치.
            int temp = i;
            i = j;
            j = temp;
        }
        while(i <= j) { // i를 1씩 증가시키며 j와 같아질 때까지 반복 수행
            System.out.print(i++ + " ");
        }
        input.close();
    }
}
