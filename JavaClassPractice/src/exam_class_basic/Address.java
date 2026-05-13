package exam_class_basic;

public class Address {
    // 필드
    public String name;
    public String address;
    public String phone;

    // 메서드
    public void addressData(String n, String addr, String p) {
        name = n;
        address = addr;
        phone = p;
    }

    public void printData() {
        System.out.println("\t\t\t주소록\n이름\t\t: " + name+ "\n주소\t\t: " + address + "\n전화번호\t: " + phone);
    }

    public String toString() {
        return String.format("\t\t\t주소록\n이름\t\t: %s\n주소\t\t: %s\n전화번호\t: %s", name, address, phone);
    }

}
