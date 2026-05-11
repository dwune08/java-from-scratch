package exam_array;
import java.util.Scanner;

public class ArrayExample6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] array = new int[10];

        while(true) {
            System.out.print("숫자 두 개를 입력해주세요: ");
            array[0] = input.nextInt();
            array[1] = input.nextInt();
            if(array[0] > 9 || array[1] > 9) System.out.println("10미만의 정수를 입력해주세요.");
            else break;
        }

        for(int i = 0; i < array.length-2; i++) {
            array[i+2] = (array[i+1]*array[i])%10;
        }
        System.out.print("[ ");
        for(int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if(i < array.length-1) System.out.print(", ");
            else System.out.print(" ]");
        }
        input.close();
    }
}
