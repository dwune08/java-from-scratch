package exam_collection_list;

public class Member {
    private String name;
    private int age;

    public Member(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return String.format("member - (name : %s, age : %d) ", name, age);
    }


    /*
    // Member 클래스의 동일 객체는 age 필드의 값이 같으면 동일 객체이다
    @Override
    public int hashCode() {
        return age;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Member) {
            Member member = (Member) obj;
            if (this.age == member.age) return true;
        }
        return false;
    }
    */


    /*
    // Member 클래스의 동일 객체는 name 필드의 값이 같으면 동일 객체이다
    @Override
    public int hashCode() {
        return name.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Member) {
            Member member = (Member) obj;
            if (name.equals(member.name)) return true;
        }
        return false;
    }
    */
    /*

    // Member 클래스의 동일 객체는 name 필드의 값과 age 필드의 값이 같으면 동일 객체이다
    @Override
    public int hashCode() {
        return name.hashCode() + age;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Member) {
            Member member = (Member) obj;
            if (name.equals(member.name) && (member.age==age)) return true;
        }
        return false;
    }
    */



}