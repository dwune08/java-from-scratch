package example;

/* [요구사항 3]
 * 50개의 난수를 만들어 for와 if문을 사용해서 다음과 같이 출력하시오.
 *
 * [조건]
 * - 난수의 값의 범위는 1 ~ 100사이의 값만 출력되게 한다
 * - 1줄에 6개씩 표시하도록 제어한다.
 * - 그 난수의 합도 마지막에 출력되도록 한다.  */

public class RandomExample1 {
    public static void main(String[] args) {
        int sum = 0;

        for(int i = 1; i <= 50; i++) { // 50개의 난수를 위해 50번 반복
            int randomNum = (int) (Math.random() * 100) + 1; //Math.random()을 사용해 1~100 사이의 난수를 생성
            sum += randomNum;
            System.out.print(randomNum + " ");
            if(i%6==0) System.out.println(); // 6줄마다 내려쓰기 하기 위해 i가 6의 배수일 때 println이 실행되도록 한다.
        }
        System.out.println("\n합계 : " + sum);
    }
}

