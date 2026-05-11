package exam_array_in_array;

public class ArrayInArrayExample {
    public static void main(String[] args) {
        // 1. 예제1
        // 2. 2차원 배열
        // 자료형[][] 배열명 = new 자료형[행의 요소][열의 요소];
        int[][] arr1 = new int[2][3];

        System.out.println("arr1.length = " + arr1.length); // 배열의 행의 수
        System.out.println("arr1[0].length = " + arr1[0].length); // 0번째 행의 열의 수
        System.out.println("arr1[1].length = " + arr1[1].length); // 1번째 행의 열의 수
        System.out.println();

        for(int i = 0; i < arr1.length; i++) {
            for(int j = 0; j < arr1[i].length; j++) {
                System.out.print("arr1[" + i + "][" + j + "]=" + arr1[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();

        int arr2[][] = new int[][] { {10,20,30}, {40,50,60} };
        // int[][] arr2 = { {10,20,30}, {40,50,60} };
        /* 0열 1열 2열
        0행 10 20 30
        1행 40 50 60 */
        for(int i = 0; i < arr2.length; i++) {
            for(int j = 0; j < arr2[i].length; j++) {
                System.out.printf("%-5d", arr2[i][j]);
            }
            System.out.println();
        }
        System.out.println();

        // 3. 예제3
        // 2차원 배열(가변 배열)
        int[][] arr3 = new int[2][];
        arr3[0] = new int[] { 1, 5 };
        arr3[1] = new int[3];
        for(int i = 0; i < arr3.length; i++) {
            for(int j = 0; j < arr3[i].length; j++) {
                System.out.print("arr3[" + i + "][" + j + "]=" + arr3[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();

        // 4. 예제 4
        // 5X5 2차원 배열에 1~25로 초기화하여 화면에 출력
        int[][] array = new int[5][5];
        // 배열 초기화
        for(int i = 0, num = 1; i < array.length; i++) {
            for(int j = 0; j < array[i].length; j++) {
                array[i][j] = num++;
            }
        }
       // 2차원 배열 출력
        for(int i = 0, num = 1; i < array.length; i++) {
            for(int j = 0; j < array[i].length; j++) {
                System.out.printf("%-5d", array[i][j]); // 변환문자의 숫자는 전체 자릿수를 의미(공백)
            }
            System.out.println();
        }
        System.out.println();

        // 합 구하기
        int sum = 0;
        for(int i = 0, num = 1; i < array.length; i++) {
            for(int j = 0; j < array[i].length; j++) {
                if(i == j) {
                    //System.out.println(array[i][j]);
                    sum += array[i][j];
                }
            }
        }
        System.out.println("합계 : " + sum);
        System.out.println();

        // 5. 예제5
        /* int[][] array = new int[5][5];
        for(int i = 0; i < array.length; i++) {
            for(int j = 0; j < array[i].length; i++) {
                array[i][j] = n++;
            }
        } */

        // 2차원 데이터 출력하기
        for(int i = 0; i < array.length; i++) {
            for(int j = 0; j < array[i].length; j++) {
                System.out.printf("%-5d", array[i][j]);
            }
            System.out.println();
        }
        System.out.println();

        int total = 0;
        for(int i = 0; i < array.length; i++) {
            for(int j = 0; j < i; j++) {
                //System.out.print(array[i][j] + " ");
                total += array[i][j];
            }
            // System.out.println();
        }
        System.out.println("합계 : " + total);
        System.out.println();

        // 예제 6.
        /* 4행 4열짜리 정수형 배열을 선언 및 할당하고
         * 1) 1 ~ 16까지 값을 차례대로 저장하세요.
         * 저장된 값들을 차례대로 출력하세요.
         * [실행 예시
         * 1  2  3  4
         * 5  6  7  8
         * 9 10 11 12
         * 13 14 15 16  */

        int[][] array6 = new int[4][4];

        for(int i = 0, num = 1; i < array6.length; i++) {
            for(int j = 0; j < array6[i].length; j++) {
                array6[i][j] = num++;
            }
        }

        for(int i = 0; i < array6.length; i++) {
            for(int j = 0; j < array6[i].length; j++) {
                System.out.printf("%-3d", array6[i][j]);
            }
            System.out.println();
        }
        System.out.println();

        // 예제 7.
        /* 4행 4열짜리 정수형 배열을 선언 및 할당하고
         * 1) 16 ~ 1과 같이 값을 거꾸로 저장하세요.
         * 저장된 값들을 차례대로 출력하세요.
         * [실행 예시
         * 16 15 14 13
         * 12 11 10 9
         * 8  7  6  5
         * 4  3  2  1  */

        int[][] array7 = new int[4][4];

        for(int i = 0, num = 16; i < array7.length; i++) {
            for(int j = 0; j < array7[i].length; j++) {
                array7[i][j] = num--;
            }
        }

        for(int i = 0; i < array7.length; i++) {
            for(int j = 0; j < array7[i].length; j++) {
                System.out.printf("%-3d", array7[i][j]);
            }
            System.out.println();
        }
        System.out.println();
    }
}
