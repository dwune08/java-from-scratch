package exam_collction_list;

import java.util.ArrayList;

public class ArrayListTest {
    public static void main(String[] args) {
        // 프로그래밍 언어(문자열)을 저장하도록 인스턴스 생성
        ArrayList<String> list = new ArrayList<String>();

        list.add("Java");   // 0
        list.add("Java");   // 1
        list.add("JSP");   // 2
        list.add("SPRING");   // 3

        int size = list.size();
        System.out.println("총 객체수 : " + size);
        System.out.println();

        list.add(1, "ORACLE");
        list.set(2, "Client programming");
        //list.remove(3);
        String data = list.remove(3);
        System.out.println("삭제된 원소 : " + data);

        int index = list.indexOf("Java");
        System.out.println(index);

        index = list.lastIndexOf("Java");
        System.out.println(index);

        for(int i = 0; i < list.size(); i++)
            System.out.println(list.get(i));

        /* for ~ each문으로 출력(향상 for문)
        형식 : for( 데이터 타입 변수명 : 배열명이나 컬렉션의 참조변수명) {
                  실행문;
              }
        for(String s : list )
        System.out.println(s);
         */
        System.out.println();

        System.out.println("list가 가진 모든 원소를 문자열로 반환");
        System.out.println(list);
        System.out.println();

        // 정수값을 저장하도록 인스턴스 생성
        ArrayList<Integer> list1 = new ArrayList<Integer>();
        list1.add(23);
        list1.add(94);
        list1.add(Integer.valueOf(62));
        list1.add(Integer.valueOf(45));

        System.out.println();

        list1.add(2, Integer.valueOf(78));
        System.out.println(list1.toString());
        System.out.println();

        /* Apple 이라는 이름으로 클래스를 생성한다.
         * 이 클래스는 품종(kind)과 색상을 필드
         * 여러 사과(Apple)을 저장하도록 인스턴스 생성하여 출력해 주세요.
         */
        ArrayList<Apple> list2 = new ArrayList<Apple>();
        list2.add(new Apple("부사", "빨강"));
        list2.add(new Apple("아오리", "청색"));
        list2.add(new Apple("썸머킹", "황금"));
        list2.add(new Apple("홍로", "빨강"));

        // 출력 - 1
        for(int i = 0; i < list2.size(); i++) {
            System.out.print("품종 : " + list2.get(i).getKind());
            System.out.println(", 색상 : " + list2.get(i).getColor());
        }
        System.out.println();

        // 출력 - 2
        for(int i = 0; i < list2.size(); i++) {
            Apple app = list2.get(i);
            System.out.print("품종 : " + app.getKind());
            System.out.println(", 색상 : " + app.getColor());
        }
        System.out.println();

        // 출력 - 3 : for ~ each 문으로 출력.
        for(Apple app : list2) {
            System.out.println(app.toString());
        }
        System.out.println();

        System.out.println("list2가 가진 모든 원소를 문자열로 반환");
        System.out.println(list2);
        System.out.println();

        ArrayList<Movie> movie = new ArrayList<Movie>();
        movie.add(new Movie("친절한 금자씨", 7.61, "박찬욱", 2005));
        movie.add(new Movie("싸이보그지만 괜찮아", 5.17, "박찬욱", 2006));
        movie.add(new Movie("박쥐", 8.63, "박찬욱", 2009));
        movie.add(new Movie("아가씨", 7.69, "박찬욱", 2016));
        movie.add(new Movie("헤어질 결심", 8.97, "박찬욱", 2022));

        for(Movie m : movie) System.out.println(m.toString());


    }
}
