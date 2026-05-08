package exam_array;

/* 다음은 20명의 학생에게 학교 식당에 대한 만족도를 조사한 결과를 처리하는 프로그램이다.
 * 학생들로 하여금 만족도를 3단계로 나누어 불만족(1), 보통(2), 만족(3) 응답하게 한 결과가
 * 주어진 표와 같을 때 만족도별 응답 횟수를 출력하는 코드를 작성하시오.  */

public class SchoolCafeteriaExample {
    public static void main(String[] args) {
        int[] survey = new int[]{1,2,1,2,3,1,2,2,3,1,3,3,1,1,1,2,3,1,3,2};
        // 배열 선언과 동시에 설문 결과값으로 초기화
        int[] stat = new int[3]; // 만족도 별로 숫자를 체크할 배열
        String[] satisfaction = new String[]{"불만족", "보통", "만족"};
        // 하는 김에 만족도 등급도 배열로

        for(int i = 0; i < 20; i++) {
            stat[survey[i]-1] += 1;
        } // 전체 설문결과(1~3)를 statistics배열의 0~2번에 대응시켜 누적합니다.
        System.out.println("학생들의 만족도 통계는 다음과 같습니다.");
        for(int i = 2; i >= 0; i--) {
            System.out.println(satisfaction[i]+ "(" + i + ") : " + stat[i] + "명");
        } // 전체 결과를 출력
    }
}