package exam_generic_type;

public class Bag<T> {
    private T item;

    public Bag(T item) {
        this.item = item;
    }

    public T getItem() {
        return item;
    }

    public void setItem(T item) {
        this.item = item;
    }

    void showType() {
        System.out.println("T의 타입은 " + item.getClass().getSimpleName());
    }
}
