package exam_class;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;

public class ArrayListExample {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        ArrayList<Double> scores = new ArrayList<>(10);

        for(int i = 0; i < 10; i++) {
            System.out.print("심사위원의 점수: ");
            double s = input.nextDouble();
            if(s > 10.0 || s < 0.0) {
                System.out.println("점수는 0.0~10.0 이어야 합니다.");
                i--;
            } else {
                scores.add(s);
            }
        }
        // sum -= Collections.max(scores) + Collections.min(scores);
        // 간단한 방법이지만 실제 원소가 지워지는 것이 아니다

        // 리스트 자체에서 날리고 더하는 방식
        double max = Collections.max(scores);
        double min = Collections.min(scores);

        // 중복 값을 한번에 다 지우는 걸 방지하기 위해 인덱스를 찾아 삭제하기
        int maxIndex = scores.indexOf(max);
        scores.remove(maxIndex);

        int minIndex = scores.indexOf(min);
        scores.remove(minIndex);

        // 점수 합산
        double sum = 0.0;
        for(double i : scores) {
            sum += i;
        }

        System.out.println("점수의 합: " + sum);
        input.close();
    }
}
