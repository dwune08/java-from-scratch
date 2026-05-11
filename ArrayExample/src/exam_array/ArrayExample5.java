package exam_array;
import java.util.Scanner;

/* 주민등록번호 성별자리 이후부터 *로 가리고 출력하세요.
 * 단, 원본 배열 값은 변경 없이 배열 복사본으로 변경하세요.
 * [실행 예시]
 * 주민등록번호(-포함) : 123456-1234567
 * 123456-1******
 */

public class ArrayExample5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("주민등록번호(-포함) : ");
        String registrationNum = input.nextLine();
        char[] regNum = new char[registrationNum.length()];

        for(int i = 0; i < 13; i++) {
            regNum[i] = registrationNum.charAt(i);
        }

        char[] copy = new char[regNum.length];
        System.arraycopy(regNum, 0, copy, 0, regNum.length);
        // 배열을 복사하는 API
        for(int i = 0; i < copy.length; i++) {
            if(i > 7) copy[i] = '*';
            System.out.print(copy[i]);
        }
        input.close();
    }
}
