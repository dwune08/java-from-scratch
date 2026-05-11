package exam_array;
import java.util.Scanner;

/* 3이상인 홀수 자연수를 입력 받아
 * 배열의 중간까지는 1부터 1씩 증가하여 오름차순으로 값을 넣고,
 * 중간 이후부터 끝까지는 1씩 감소하여 내림차순으로 값을 넣어 출력하세요.
 * 단, 입력한 정수가 홀수가 아니거나 3 미만일 경우 "다시 입력하세요"를 출력하고
 * 다시 정수를 받도록 하세요. */

public class ArrayExample4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int naturalNum, j = 0;

        while(true) {
            System.out.print("정수 : ");
            naturalNum = input.nextInt();
            if(naturalNum%2 == 0 || naturalNum < 3) System.out.println("다시 입력하세요.");
            else break;
        }

        int[] array = new int[naturalNum];

        array[0] = 1;
        for(int i = 0; i < naturalNum; i++) {
            if(i <= naturalNum/2) array[i] = i+1;
            else array[i] = array[naturalNum-i-1];
        }
        for(int i : array) {
            System.out.print(i);
            if(j++ < array.length-1) System.out.print(", ");
        }
        input.close();
    }
}
