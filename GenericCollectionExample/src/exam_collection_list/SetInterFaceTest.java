package exam_collection_list;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class SetInterFaceTest {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        //LinkedHashSet<String> set = new LinkedHashSet<String>();
        //TreeSet<String> set = new TreeSet<String>();
        set.add("Milk");
        set.add("Bread");
        set.add("Butter");
        set.add("Cheese");
        set.add("Ham");
        set.add("Ham");

        System.out.println(set.toString());

        // 반복자
        /*Iterator<String> it = set.iterator();
        while(it.hasNext()) {
            System.out.print(it.next() + " ");
        }*/

        HashSet<Integer> set1 = new HashSet<>();
        set1.add(Integer.valueOf(3));
        set1.add(5);
        set1.add(3);
        set1.add(4);

        System.out.println(set1.toString());
    }
}

