package exam_collection_list;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListTest {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("Galaxy S23");
        list.add("iPhone 15");

        System.out.println(list);
        System.out.println();

        Iterator<String> it = list.iterator();
        while ((it.hasNext())) {
            System.out.println(it.next());
        }
    }
}
