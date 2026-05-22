package exam_collection_list;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorTest02 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("서울");
        list.add("북경");
        list.add("상해");
        list.add("서울");
        list.add("도쿄");
        list.add("뉴욕");

        // ArrayList의 원소를 인덱스로 접근하고자 할 때
        for (String s : list) {
            System.out.println(s);
        }
        System.out.println("==================");

        Iterator<String> iter = list. iterator();
        while (iter.hasNext()) {
            System.out.println(iter.next());
        }
    }
}