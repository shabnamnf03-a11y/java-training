package Day11;

public class Problem7 {
    public static void main(String[] args) {
        Test t = new Test();

        t.show();
    }
}

interface A {
    void show();
}

interface B {
    void print();
}

class Test implements A, B {

    public void show() {
        System.out.println("Show");
    }

    public void print() {
        System.out.println("Print");
    }
}