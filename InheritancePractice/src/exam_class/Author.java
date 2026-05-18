package exam_class;

public class Author {
    private String AuthorName;
    private int AuthorAge;
    private String AuthorNation;

    public Author() {
    }

    public Author(String authorName, int authorAge, String authorNation) {
        AuthorName = authorName;
        AuthorAge = authorAge;
        AuthorNation = authorNation;
    }

    public String getAuthorName() {
        return AuthorName;
    }

    public void setAuthorName(String authorName) {
        AuthorName = authorName;
    }

    public int getAuthorAge() {
        return AuthorAge;
    }

    public void setAuthorAge(int authorAge) {
        AuthorAge = authorAge;
    }

    public String getAuthorNation() {
        return AuthorNation;
    }

    public void setAuthorNation(String authorNation) {
        AuthorNation = authorNation;
    }

    public String toString() {
        return AuthorName + "(" + AuthorAge + ", " + AuthorNation + ")";
    }
}
