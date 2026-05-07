package exam_for;

public class ForExample {
    public static void main(String[] args) {
        // [예제1] 5번 문장 출력
        for(int i = 1; i <= 5; i++) {
            System.out.print(i + ", ");
            System.out.print("Hello, World!");
            System.out.println("I love Coding.");
        }

        System.out.println();

        // [예제2] - 1부터 10까지의 합
        int sum = 0;
        for(int i = 1; i <= 10; i++) {
            sum += i;
        }
        System.out.printf("1부터 10까지의 정수의 합 = %d\n\n", sum);

        /* [예제3]
         * for문을 이용해서 1부터 10까지의 정수 중에서
         * 3의 배수(3, 6, 9, ...)의 총합을 구하는 코드를 작성해 보세요.
         * 추가요구 사항은 3의 배수의 개수와 3의 배수를 출력.
         */

        int count = 0;
        sum = 0;

        for(int i = 1; i <= 10; i++) {
            if(i%3 == 0) {
                System.out.print(i);
                if(i+3 <= 10) System.out.print(", ");
                sum += i;
                count++;
            }
        }
        System.out.println("\n3의 배수의 개수는 " + count + "개, 총합은 " + sum);
    }
}
