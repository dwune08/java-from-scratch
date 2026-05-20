package exam_interface_example;

public class BookCDMS {
    public static void main(String[] args) {
        SeparateVolume book1 = new SeparateVolume(863774, "엄마를 부탁해", "신경숙");
        book1.checkOut("홍길동", "2026-05-19");
        System.out.println(book1.showBookInfo());

        MusicCDInfo musicCD1 = new MusicCDInfo("CD","동행","김동률", new String[]{"고백", "청춘", "내 사람"});
        System.out.println("=== 음악 CD 정보 ===");
        System.out.println(musicCD1.showCDInfo());

        AppCDInfo cd1 = new AppCDInfo("CD002", "자바 학습 프로그램");
        cd1.checkOut("김철수", "2026-05-19");
        System.out.println(cd1.showCDInfo());

        book1.checkIn(); // 책 반납
        cd1.checkIn(); // cd 반납
    }
}
