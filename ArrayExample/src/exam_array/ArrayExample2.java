package exam_array;
import java.util.Scanner;

public class ArrayExample2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        /* [예제1] 사용자로 하여금 5개의 정수를 입력받아 그 값을 출력하시오.
         * (단 배열을 이용하여.)  */

        // 배열 선언        // 배열 생성
        int[] nums = new int[5];

        System.out.println("== 배열의 값 입력 ===");
        for(int i = 0; i < 5; i++) {
            System.out.print((i+1) + "번째 정수 입력 : ");
            nums[i] = input.nextInt();
        }

        System.out.println("=== 배열의 값 출력 ===");
        for(int j = 0; j < 5; j++) {
            System.out.println("nums[" + j + "] = " + nums[j]);
        }
        System.out.println();

        // 문자열 배열
        String[] language = {"java", "C", "C++"};
        for(int i = 0; i < language.length; i++) {
            System.out.println(language[i]);
        }
        System.out.println();

        /* [예제 2]
         * 5명의 국어점수는 80, 95, 90, 85, 100으로 배열에 초기화 하고
         * 영어점수는 입력을 받아 배열에 저장하여 출력하는 프로그램을 작성하시오. */

        int[] kor = {80, 95, 90, 85, 100};
        int[] eng = new int[5];

        for(int i = 0; i < 5; i++) {
            System.out.print("영어 점수를 입력해 주세요.");
            eng[i] = input.nextInt(); // 입력값 배열 저장
        }
        input.nextLine(); // 남은 엔터 캐시 털기

        for(int i = 0; i < 5; i++) {
            System.out.printf("국어 :%3d ", kor[i]);
            System.out.printf("영어 :%3d\n", eng[i]);
        }
        System.out.println();

        /* [예제 3]
         * 길이가 10인 배열을 선언하고 1부터 10까지의 값을 반복문을 이용하여
         * 순서대로 배열 인덱스에 넣은 후 그 값을 출력하세요. */

        int[] array1 = new int[10];

        for(int i = 0; i < 10; i++) {
            array1[i] = i + 1;
        }

        for(int i = 0; i < 10; i++) {
            System.out.print(array1[i] + " ");
        }
        System.out.println();

        /* [예제 4]
         * 길이가 10인 배열을 선언하고 1부터 10까지의 값을 반복문을 이용하여
         * 역순으로 배열 인덱스에 넣은 후 그 값을 출력하세요. */

        int[] array2 = new int[10];

        for(int i = 0; i < array2.length; i++) {
            array2[i] = array2.length - i;
        }

        for(int i = 0; i < 10; i++) {
            System.out.print(array1[i] + " ");
        }
        System.out.println();

        /* [예제 5]
         * 문자열을 입력 받아 문자 하나하나를 배열에 넣고
         * 검색할 문자가 문자열에 몇개 들어있는지,
         * 그 개수와 몇 번째 인덱스에 위치하는지 인덱스를 출력하세요.
         *
         * [출력 예제]
         * 문자열 : application
         * 문자 : i
         * application에 i가 존재하는 위치(인덱스) : 4 8
         * i 개수 : 2
         */

        char[] charArray = null;
        int count = 0;

        System.out.print("문자열 : ");
        String str = input.nextLine();

        System.out.print("문자 : ");
        char ch = input.nextLine().charAt(0);

        charArray = new char[str.length()];

        for(int i = 0; i < charArray.length; i++) {
            charArray[i] = str.charAt(i);
        }

        //2. 메서드로 문자형 배열 얻기
        // charArray = str.toCahrArray();

        System.out.printf("%s에 %c가 존재하는 위치(인덱스): ", str, ch);
        for(int i = 0; i < charArray.length; i++) {
            if(charArray[i] == ch) {
                System.out.print(i + " ");
                count++;
            }
        }
        System.out.printf("\n%c 개수: %d", ch, count);
        input.close();
    }
}