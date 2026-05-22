package exam_collection_list;

import java.util.Arrays;
import java.util.List;

public class ArrayAsListExample {
    public static void main(String[] args) {
        String[] names = {"홍길동", "김철수", "조미진"};

        List<String> list1 = Arrays.asList(names);
        System.out.println("list1 리스트 개수 " + list1.size());

        for (String name : list1) { //lis1.get(0);
            System.out.print(name + " ");
        }
        System.out.println();
        Integer[] number = {10, 20, 30};
        List<Integer> list2 = Arrays.asList(number);
        System.out.println("\nlist2 리스트 개수 " + list2.size());

        for(Integer value : list2) {
            System.out.print(value + " ");
        }

        int[] num = {10, 20, 30};
        List<int[]> list3 = Arrays.asList(num);
        System.out.println("\nlist3 리스트 개수 " + list3.size());

        for(int[] value : list3) {
            System.out.print(Arrays.toString(value) + " ");
        }
    }

}
