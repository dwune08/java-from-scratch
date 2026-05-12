package exam_array_in_array;
import java.util.Scanner;

public class ArrayInArrayExample3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int row, col;

        System.out.println("2차원 배열 생성 프로그램");
        System.out.println("행과 열의 크기를 입력해주세요.");
        while(true) {
            System.out.print("행 크기 (1~10) : ");
            row = input.nextInt();
            System.out.print("열 크기 (1~10) : ");
            col = input.nextInt();

            if(row > 10 || row < 1 || col > 10 || col < 1) {
                System.out.println("반드시 1~10 사이의 정수를 입력해야 합니다. 다시 입력해 주세요.");
            } else break;
        }

        char[][] array = new char[row][col];
        for(int i = 0; i < row; i++) {
            for(int j = 0; j < col; j++) {
                array[i][j] = (char)((int)(Math.random()*26)+65);
                // 65~90 난수를 발생시켜 대응되는 알파벳으로 array에 저장
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
        input.close();
    }
}
