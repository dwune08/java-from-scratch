package exam_while;

/* 1에서 100까지 짝수의 합과 홀수의 합을 각각 구해보자. */

public class WhileExample1 {
    public static void main(String[] args) {
        int i = 1, oddSum = 0, evenSum = 0;

        while(i <= 100) {
            if(i%2 == 0) evenSum +=i++; // 짝수인 경우 더하기
            else oddSum +=i++;          // 홀수인 경우 더하기
        }
        System.out.println("1에서 100까지 홀수의 합 : " + oddSum);
        System.out.println("1에서 100까지 짝수의 합 : " + evenSum);
    }
}
