package Day14;

public class Problem10 {

    class A extends Thread {
        public void run() {
            System.out.println("Thread A");
        }
    }

    public static void main(String[] args) {
        Problem10 obj = new Problem10();
        A t = obj.new A();
        t.start();
    }
}