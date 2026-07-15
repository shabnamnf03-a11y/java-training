package Day14;

public class Problem8 {

    static class MyThread extends Thread {
        public void run() {
            System.out.println("Thread Running");
        }
    }

    public static void main(String[] args) {
        MyThread t = new MyThread();
        t.start();
    }
}