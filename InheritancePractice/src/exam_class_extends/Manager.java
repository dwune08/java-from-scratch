package exam_class_extends;

public class Manager extends Employee {
    private int bonus;
    private String job;

    public Manager() {
        System.out.println("Manager 생성자 호출");
    }

    public Manager(String name, String address, String phoneNumber, int salary, int bonus, String job) {
        super(name, address, phoneNumber, salary);
        this.bonus = bonus;
        this.job = job;
        System.out.println("Manger(name, address, phoneNumber, salary, bonus, job) 생성자 호출");
    }

    public int getBonus() {
        return bonus;
    }

    public void setBonus(int bonus) {
        this.bonus = bonus;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public String toString() {
        return super.toString() + ", job = " + job + ", bonus = " + bonus;
    }
}
