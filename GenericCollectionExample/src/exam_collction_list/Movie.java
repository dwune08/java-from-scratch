package exam_collction_list;

public class Movie {
    private String title;
    private double rating;
    private String director;
    private int releaseYear;

    public Movie(String title, double rating, String director, int releaseYear) {
        this.title = title;
        this.rating = rating;
        this.director = director;
        this.releaseYear = releaseYear;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }

    @Override
    public String toString() {
        return "제목 : " + title + ", 평점 : " + rating + ", 감독 : " + director + ", 개봉 연도 : " + releaseYear;
    }
}
