package exam_interface;

import java.util.Arrays;

class Student implements Comparable {
    private String name;    // 이름
    private int total;      // 총점(국어+영어+수학점수의 총합 = 300점으로 가정.)

    public Student(String name, int total) {
        this.name = name;
        this.total = total;
    }

    public String getName() {
        return name;
    }

    public int getTotal() {
        return total;
    }

    @Override
    public String toString() {
        return "이름=" + name + " 총점="+ total;
    }

    public int compareTo(Object obj) {
        Student student = (Student) obj;
        // 총점 기준
        if(this.total < student.total) return -1;
        else if(this.total > student.total) return 1;
        else return 0;
        // 이름 기준
        // return this.name.compareTo(student.name);

    }
}

public class StudentSort {
    public static void main(String[] args) {
        // [연습]
        // 5개의 숫자를 오름차순 정렬하여 출력하는 코드를 작성해 주세요.
        int[] numbers = {60, 88, 10, 45, 90};
        Arrays.sort(numbers);

        for(int num : numbers) {
            System.out.print(num + " ");
        }
        System.out.println("\n");

        // 3명의 학생 총점으로 오름차순 정렬하여 출력하는 코드를 작성해 주세요.
        Student[] students = {
                new Student("홍길동", 270),
                new Student("이한솔", 290),
                new Student("김희진", 210),
        };
        Arrays.sort(students);

        for(Student student : students) {
            System.out.println(student);
        }
    }
}
