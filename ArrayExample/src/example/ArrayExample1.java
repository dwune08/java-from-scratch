package example;
import java.util.Scanner;

public class ArrayExample1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] num = new int[10];

        System.out.print("여러 수들을 입력해 주세요(공백기준): ");
        String numbers = input.nextLine();
        String[] array = numbers.split(" ");
        for (String s : array) {
            num[Integer.parseInt(s) - 1]++; // 입력받은 수들을 인덱스로 사용하여 배열에 집계
        } // 입력받은 값이 1~10 사이가 아니면 에러나니 처리가 필요함

        for(int i = 0; i < num.length; i++) {
            System.out.println((i+1) + "의 개수 : " + num[i]); // 출력
        }
        input.close();
    }
}