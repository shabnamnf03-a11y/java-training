package Day11;

public class Problem8 {
    public static void main(String[] args) {

        Circle c = new Circle();

        c.draw();
    }
}

interface Shape {
    void draw();
}

class Circle implements Shape {

    public void draw() {
        System.out.println("Circle");
    }
}