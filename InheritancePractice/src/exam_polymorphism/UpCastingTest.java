package exam_polymorphism;

class Shape { // 도형
    String name;
    public Shape() {    }
    public Shape(String name) {
        this.name = name;
    }
}

class Square extends Shape {
    public Square() {}
    public Square(String name) {
        super(name);
    }
}

class Triangle extends Shape {
    public Triangle() {}
    public Triangle(String name) {
        super(name);
    }
}

class Circle extends Shape {
    public Circle() {}
    public Circle(String name) {
        super(name);
    }
}

public class UpCastingTest {
    public static void main(String[] args) {
        Square s = new Square();
        s.name = "정사각형";
        System.out.println(s.name);

        Triangle t = new Triangle();
        t.name = "삼각형";
        System.out.println(t.name);

        Circle c = new Circle();
        c.name = "삼각형";
        System.out.println(c.name);
        System.out.println();

        /*Shape[] shapes = {s, t, c};          */

        Shape [] shapes = {
                new Square("정사각형"),
                new Triangle("삼각형"),
                new Circle("원")
        };

        for(int i = 0; i < shapes.length; i++) {
            System.out.printf("%d번 인덱스의 도형: %s\n", i, shapes[i].name);
        }
    }
}
