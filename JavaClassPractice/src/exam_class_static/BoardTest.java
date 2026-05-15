package exam_class_static;

public class BoardTest {
    public static void main(String[] args) {
        Board board1 = new Board("자바란", "홍길동");
        System.out.println(board1.toString());

        Board board2 = new Board("자바에 대한 정의", "김철수");
        System.out.println(board2.toString());
    }
}