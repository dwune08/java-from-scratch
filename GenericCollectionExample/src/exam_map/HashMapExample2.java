package exam_map;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapExample2 {
    public void main(String[] args) {
        // key = 번호, value = 학생정보
        HashMap<Integer, Student> student = new HashMap<Integer, Student>();
        student.put(1, new Student(99030001, "홍길동"));
        student.put(2, new Student(99030002, "김도훈"));
        student.put(3, new Student(99030003, "윤도희"));
        student.put(3, new Student(99030004, "김희진"));

        System.out.println(student);
        System.out.println();

        Set<Integer> keySet = student.keySet();
        Iterator<Integer> it = keySet.iterator();
        while(it.hasNext()) {
            Integer key = it.next();
            Student sst = student.get(key);
            System.out.println(key + " " + sst.toString());
        }
        System.out.println();

        // 키와 값의 한 쌍으로 구성된 객체를 Set에 담아서 리턴
        for(Map.Entry<Integer, Student> s : student.entrySet()){
            Integer key = s.getKey();
            Student value = s.getValue();
            System.out.println("key = " + key + ", value = " + value);
        }
        System.out.println();


        Map<Student, Integer> map = new HashMap<Student, Integer>();
        map.put(new Student(70010001, "홍길동"), 95);
        map.put(new Student(70010001, "홍길동"), 89);

        System.out.println("총 Entry 수:  " + map.size());
        System.out.println(map);
        System.out.println();

        for(Student s : map.keySet()) {
            System.out.println(s + " => " + map.get(s));

            System.out.println();
        }
    }
}
