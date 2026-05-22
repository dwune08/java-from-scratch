package exam_collection_list;

public class Movie {
    private String title;
    private String rating;
    private String director;
    private String releaseYear;

    public Movie(String title, String rating, String director, String releaseYear) {
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

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String  getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(String releaseYear) {
        this.releaseYear = releaseYear;
    }

    @Override
    public String toString() {
        return "제목 : " + title + ", 평점 : " + rating + ", 감독 : " + director + ", 개봉 연도 : " + releaseYear;
    }
}
