package exam_continue;

public class ContinueTest {
    public static void main(String[] args) {
        /* 1 ~ 10 까지의 수 중에서 홀수를 출력하도록 continue를 상요하여 보자. */
        int a = 0;
        do {
            a++;
            if(a % 2 == 0) continue;
            System.out.printf("%5d", a);
        } while(a < 10);

        System.out.println();

        /* 1 ~ 10 까지의 수 중에서 짝수를 출력하도록 continue를 사용하여 보자. */
        for(int i = 1; i <= 10; i++) {
            if(i % 2 != 0) {
                continue;
            }
            System.out.printf("%5d", i);
        }
        System.out.println();
    }
}
