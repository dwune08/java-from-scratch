package exam_class;

public class TV {
    private String manufacturer;    // 제조사
    private int year;               // 년도
    private int size;               // 크기(인치)

    public TV() { }

    public TV(String manufacturer, int year, int size) {
        this.manufacturer = manufacturer;
        this.year = year;
        this.size = size;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public void show() {
        System.out.println(manufacturer + "에서 만든 " + year + "년형 " + size + "인치 TV");
    }
}
