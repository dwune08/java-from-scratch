package exam_class;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class RandomList {
    public static void main(String[] args) {
        Random random = new Random();
        ArrayList<Integer> list = new ArrayList<>();

        System.out.println("정렬 전 list 데이터");
        for(int i = 0; i < 10; i++) {
            list.add(random.nextInt(100) + 1);
            System.out.printf("%-4d", list.get(i));
        }
        System.out.println();

        Collections.sort(list);

        System.out.println("정렬 후 list 데이터");
        for(int i : list) {
            System.out.print(i + "\t");
        }
        System.out.println();
    }
}
