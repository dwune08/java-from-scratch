package exam_class_basic;

public class AddressTest {
    public static void main(String[] args) {
        Address add = new Address();

        // 메서드를 통해 입력하고 출력하기
        add.addressData("홍길동", "서울 강서구 공항동 777-777", "010-7650-3460");
        add.printData();
        System.out.println();
        System.out.printf(add.toString());

        System.out.println("\n");

        // 직접 필드에 값 대입하고 출력하기
        Address add2 = new Address();
        add2.name = "성이름";
        add2.address = "서울시 서대문구 연희동 888-888";
        add2.phone = "010-2830-4150";

        add2.printData();
        System.out.println();
        System.out.printf(add2.toString());
    }
}
