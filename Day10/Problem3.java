package Day10;

public class Problem3 {
    public static void main(String[] args) {
        Circle c = new Circle();
        c.area();

        Rectangle r = new Rectangle();
        r.area();
    }
}

abstract class Shape {
    abstract void area();
}

class Circle extends Shape {

    void area() {
        System.out.println("Circle Area");
    }
}

class Rectangle extends Shape {

    void area() {
        System.out.println("Rectangle Area");
    }
}