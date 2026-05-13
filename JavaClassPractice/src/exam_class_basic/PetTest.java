package exam_class_basic;

public class PetTest {
    public static void main(String[] args) {
        Pet pet1 = new Pet();

        // 메서드를 통해 입력하고 출력하기
        pet1.petData("뽀삐", "말티즈", '암');
        pet1.printData();
        System.out.println();
        System.out.printf(pet1.toString());

        System.out.println("\n");

        // 직접 필드에 값 대입하고 출력하기
        Pet pet2 = new Pet();
        pet2.name = "바둑이";
        pet2.species = "달마시안";
        pet2.gender = '수';

        pet2.printData();
        System.out.println();
        System.out.printf(pet2.toString());
    }
}
