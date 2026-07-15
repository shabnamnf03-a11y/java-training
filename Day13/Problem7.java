package Day13;

class Counting1 {
    int count = 0;

    synchronized void click() {
        count++;
    }
}

public class Problem7 {
    public static void main(String[] args) {

        Counting1 c = new Counting1();

        Thread t1 = new Thread(() -> {
            for (int itr = 1; itr <= 1000; itr++) {
                c.click();
            }
        });

        Thread t2 = new Thread(() -> {
            for (int itr = 1; itr <= 1000; itr++) {
                c.click();
            }
        });

        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Count = " + c.count);
    }
}