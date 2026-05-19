package exam_interface_example;

public class BookCDMS {
    public static void main(String[] args) {
        SeparateVolume book1 = new SeparateVolume(863774, "엄마를 부탁해", "신경숙");
        book1.checkOut("홍길동", "2026-05-19");
        System.out.println(book1.showBookInfo());

        MusicCDInfo musicCD1 = new MusicCDInfo(???, "동행", "")
        System.out.println("=== 음악 CD 정보 ===");


    }
}
