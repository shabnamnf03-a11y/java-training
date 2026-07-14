package Day10;

public class Problem2 {
    public static void main(String[] args) {
        Demo d = new Demo();

        d.show();
    }
}

class Demo {

    public int a = 10;
    protected int b = 20;
    int c = 30;
    private int d = 40;

    void show() {

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
    }
}