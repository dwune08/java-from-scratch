package phoneinfoproject;

public class PhoneInfo {
    private String name;
    private String phoneNumber;


    public PhoneInfo() { } // default 생성자

     public PhoneInfo(String name, String phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void showPhoneInfo() {
        System.out.println("name:" + name);
        System.out.println("phone:" + phoneNumber);
    }
}
