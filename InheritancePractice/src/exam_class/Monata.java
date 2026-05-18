package exam_class;

public class Monata extends Car {
    private String series;
    private String use;

    public Monata(String color, int account, String use, String series) {
        super(color, account);
        this.series = series;
        this.use = use;
    }

    public String toString() {
        return super.toString() + "\t[용도] " + use + "\t\t[시리즈] " + series;
    }
}
