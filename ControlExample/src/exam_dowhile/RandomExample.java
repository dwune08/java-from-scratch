package exam_dowhile;
/* 난수란 정해진 범위 안에서 무작위로 추출되어
 * 다음 값을 쉽게 예측할 수 없는 수를 말한다.
 * 자바에서는 Math.random() 메서드를 사용하여
 * 0.0 이상 1.0 미만의 double형 실수값을 얻을 수 있다.
 * 다만 컴퓨터는 정해진 알고리즘에 따라 값을 생성하기 때문에,
 * 완전히 무작위인 수를 만드는 것은 어렵다.
 *
 * 원하는 범위의 정수 만들기 - (int) (Math.random() * 개수) + 시작값
 */
public class RandomExample {
    public static void main(String[] args) {
        System.out.println(Math.random());

        System.out.println((int)(Math.random() * 10)); // 0~9 사이의 정수값
        System.out.println((int)(Math.random() * 10) + 1); // 1~10

        int num = (int)(Math.random() * 6) + 1;
        System.out.println("주사위 : " + num);
    }
}
