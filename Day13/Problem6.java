package Day13;
class Counting {
    int count = 0;

    void click() {
        count++;
    }
}

public class Problem6 {

    public static void main(String[] args) {

        Counting c = new Counting();

        Thread t1 = new Thread(() -> {
            for (int i = 1; i <= 1000; i++) {
                c.click();
            }
        });

        Thread t2 = new Thread(() -> {
            for (int i = 1; i <= 1000; i++) {
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