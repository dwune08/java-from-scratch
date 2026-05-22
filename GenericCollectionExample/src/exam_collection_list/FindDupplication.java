package exam_collection_list;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class FindDupplication {
    public static void main(String[] args) {
        String[] sample = {"단어", "의미", "구절", "의미", "단락"};
        HashSet<String> set = new HashSet<>();

        for(String word : sample) {
            if(!set.add(word)) {
                System.out.println("중복된 단어 : " + word);
            }
        }

        System.out.println("단어 수 : " + set.size());
        System.out.println(set.toString());
    }
}