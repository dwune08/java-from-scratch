package exam_class;

public class Publisher {
    private String publisherName;
    private String nationName;

    public Publisher() {
    }

    public Publisher(String publisherName, String nationName) {
        this.publisherName = publisherName;
        this.nationName = nationName;
    }

    public String getPublisherName() {
        return publisherName;
    }

    public void setPublisherName(String publisherName) {
        this.publisherName = publisherName;
    }

    public String getNationName() {
        return nationName;
    }

    public void setNationName(String nationName) {
        this.nationName = nationName;
    }

    public String toString() {
        return publisherName + "(" + nationName + ")";
    }
}
