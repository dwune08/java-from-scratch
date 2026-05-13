package exam_class_basic;

public class Movie {

    // 필드 정의
    public String title;    // 제목
    public String director; // 감독
    public String genre;    // 장르
    public int rating;      // 상영 등급

    // 필드값 입력받는 메서드
    public void movieData(String t, String d, String g, int r) {
        title = t;
        director = d;
        genre = g;
        rating = r;
    }

    // 출력 메서드
    public String toString() {
        if(rating == 0) {
            return String.format("제목\t\t: %s\n감독\t\t: %s\n장르\t\t: %s\n관람등급\t: 전체 관람가", title, director, genre);
        } else {
            return String.format("제목\t\t: %s\n감독\t\t: %s\n장르\t\t: %s\n관람등급\t: %2d세 이상 관람가", title, director, genre, rating);
        }
    }

    // 직접 출력 메서드
    public void printData() {

        System.out.println("제목\t\t: " + title + "\n감독\t\t: " + director + "\n장르\t\t: " + genre);
        if(rating == 0) {
            System.out.print("상영등급\t: 전체 관람가");
        } else {
            System.out.print("상영등급\t: " + rating + "세 이상 관람가");
        }
    }
}
