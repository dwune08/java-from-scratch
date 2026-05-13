package exam_class_basic;
import java.util.Scanner;

public class MovieTest {
    /*
    public static void main(String[] args) {
        Movie mInfo1 = new Movie();

        mInfo1.title = "그랜드 부다페스트 호텔 (2014)";
        mInfo1.director = "웨스 앤더슨";
        mInfo1.genre = "블랙 코미디";
        mInfo1.rating = 15;
        mInfo1.printData();

        System.out.println("\n");

        Movie mInfo2 = new Movie();
        mInfo2.movieData("인생은 아름다워 (1997)", "로베르토 베니니", "드라마", 0);
        System.out.printf(mInfo2.toString());
    }
    */

    public static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {

        Movie mv1 = new Movie();

        /*
        System.out.print("제목을 입력하세요. ");
        mv1.title = input.nextLine();
        System.out.print("감독을 입력하세요. ");
        mv1.director = input.nextLine();
        System.out.print("장르를 입력하세요. ");
        mv1.genre = input.nextLine();
        System.out.print("상영등급을 입력하세요. ");
        mv1.rating = input.nextInt();
        input.nextLine();
        */

        dataInput(mv1); // 주석 처리된 부분을 메서드로 만들어 사용

        Movie mv2 = new Movie();

        /*
        System.out.println("제목, 감독, 장르, 상영등급을 차례로 입력해주세요.");
        mv2.movieData(input.nextLine(), input.nextLine(), input.nextLine(), input.nextInt());
        */

        dataInput(mv2); // 주석 처리된 부분을 메서드로 만들어 사용

        mv1.printData(); // 출력1
        System.out.println("\n");
        System.out.printf(mv2.toString()); // 출력2

        input.close();
    }

    public static void dataInput(Movie mv) {
        System.out.print("제목을 입력하세요. ");
        mv.title = input.nextLine();
        System.out.print("감독을 입력하세요. ");
        mv.director = input.nextLine();
        System.out.print("장르를 입력하세요. ");
        mv.genre = input.nextLine();
        System.out.print("상영등급을 입력하세요. ");
        mv.rating = input.nextInt();
        input.nextLine();
    }
}
