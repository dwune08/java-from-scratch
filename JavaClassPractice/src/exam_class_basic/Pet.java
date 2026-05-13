package exam_class_basic;

public class Pet {
    public String name;
    public String species;
    public char gender;

    public void petData(String n, String s, char g) {
        name = n;
        species = s;
        gender = g;
    }

    public void printData() {
        System.out.println("\t반려동물 정보\n이름\t: " + name+ "\n종\t: " + species + "\n성별\t: " + gender);
    }

    public String toString() {
        return String.format("\t반려동물 정보\n이름\t: %s\n종\t: %s\n성별\t: %s", name, species, gender);
    }
}
