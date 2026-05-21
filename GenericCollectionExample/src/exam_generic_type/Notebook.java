package exam_generic_type;

public class Notebook {
    private String make;
    private String size;

    public Notebook() {
    }

    public Notebook(String size, String make) {
        this.size = size;
        this.make = make;
    }

    @Override
    public String toString() {
        return "Notebook [make=" + make + ", size=" + size + "]";
    }
}
