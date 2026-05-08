package exam_array;

/* 다음의 정수 중에 12, 26, 68, 98, 76, 54, 8, 6, 4
 * 가장 큰값(최대값), 가장 작은값(최소값)을 출력해 주세요.
 *
 * [출력 결과]
 * 최대값 :00, 최소값 :00  */

public class MaxMinExample {
    public static void main(String[] args) {
        int[] numbers = new int[]{12, 26, 68, 98, 76, 54, 8, 6, 4};
        int minNum = 0, maxNum = 0;

        for(int i = 0; i < numbers.length; i++) {
            if(minNum > numbers[i] || i == 0) minNum = numbers[i];
            if(maxNum < numbers[i] || i == 0) maxNum = numbers[i];
        }
        System.out.println("최대값 : " + maxNum + ", 최소값 : " + minNum);
    }
}
