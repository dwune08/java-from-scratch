package exam_class;


public class Fruit {
    private static int totalPrice;
    private String fname;
    private int price;

    public Fruit() {    }

    public Fruit(String fname, int price) {
        this.fname = fname;
        this.price = price;
        totalPrice += price;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public static int getTotalPrice() {
        return totalPrice;
    }

    public void printData() {
        System.out.println(fname + " : " + price);
    }

    public String toString() {
        return String.format("%-10s\t:\t%5d", fname, price);
    }

    public static void printDiscountPrice(int discount) {
        int finalPrice = totalPrice*(100-discount)/100;
        System.out.println("총금액 : " + totalPrice);
        System.out.print("할인후 결제 금액 : " + finalPrice + "원");
    }
}
