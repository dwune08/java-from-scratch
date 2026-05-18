package exam_class;

public class Book {
    private String title;
    private int pages;
    Author jakga;
    Publisher choolpan;

    public Book() {
    }

    public Book(String title, int pages, String authorName, int authorAge, String authorNation, String publisherName, String nationName) {
        this.title = title;
        this.pages = pages;
        jakga = new Author(authorName, authorAge, authorNation);
        choolpan = new Publisher(publisherName, nationName);
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public Author getJakga() {
        return jakga;
    }

    public void setJakga(Author jakga) {
        this.jakga = jakga;
    }

    public Publisher getChoolpan() {
        return choolpan;
    }

    public void setChoolpan(Publisher choolpan) {
        this.choolpan = choolpan;
    }

    public String toString() {
        return title+" (총페이지 수: " + pages + ")\n" + jakga.toString() +" / " + choolpan.toString();
    }


}
