package phoneinfoproject;

public class PhoneUnivInfo extends PhoneInfo {
    private String major;
    private  int year;

    public PhoneUnivInfo(String name, String phoneNumber, String major, int year) {
        super(name, phoneNumber);
        this.major = major;
        this.year = year;
    }

    public String getMajor() {
        return major;
    }

    public int getYear() {
        return year;
    }
}
