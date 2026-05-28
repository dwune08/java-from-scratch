package exam_multi_catch;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MultiCatchExample {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        try {
            int[] numbers = new int[2];

            System.out.print("정수를 입력해 주세요: ");
            numbers[2] = scan.nextInt();
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("배열의 인덱스 범위를 벗어낫습니다.");
        } catch (InputMismatchException e) {
            System.out.println("정수를 입력해야 합니다.");
        } catch (Exception e) {
            System.out.println("알 수 없는 예외가 발생했습니다.");
        } finally {
            System.out.println("finally 블록은 항상 실행됩니다.");
            scan.close();
        }
    }
}
