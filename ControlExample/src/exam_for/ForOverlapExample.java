package exam_for;

public class ForOverlapExample {
    public static void main(String[] args) {
        /* 결과
         * 1 2 3 4 5
         */
        for(int x = 1; x<= 5; x++) {
            System.out.print(x + " ");
        }
        System.out.println();

        System.out.println("\n중첩 반복문\n");

        /* 결과
         * 1 2 3 4 5
         * 1 2 3 4 5
         * 1 2 3 4 5
         * 1 2 3 4 5
         * 1 2 3 4 5
         */

        for(int y = 1; y <= 5; y++) {
            for(int x = 1; x <= 5; x++) {
                System.out.print(x + " ");
            }
            System.out.println();
        }
        System.out.println();

        /* 결과
         * 1 2 3 4 5
         * 1 2 3 4
         * 1 2 3
         * 1 2
         * 1
         */

        for(int i = 5; i >= 1; i--) {
            for(int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
        System.out.println();

        /* 결과
         * 1
         * 1 2
         * 1 2 3
         * 1 2 3 4
         * 1 2 3 4 5
         */

        for(int i = 1; i <= 5; i++) {
            for(int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
        System.out.println();

        /* 결과
         * 1 2 3 4 5
         * 2 3 4 5 6
         * 3 4 5 6 7
         * 4 5 6 7 8
         * 5 6 7 8 9
         */

        for(int i = 1; i <= 5; i++) {
            for(int j = 0; j < 5; j++) {
                System.out.print((i+j) + " ");
            }
            System.out.println();
        }
    }
}
