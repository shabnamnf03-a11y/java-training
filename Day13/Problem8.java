package Day13;

class NewThread implements Runnable {

    public void run() {
        for (int itr = 1; itr <= 5; itr++) {
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Process " + itr);
        }
    }
}

public class Problem8 {

    public static void main(String[] args) {

        NewThread thread = new NewThread();
        Thread t1 = new Thread(thread);

        t1.start();

        System.out.println(t1.isAlive());

        t1.setName("Thread-1");
        System.out.println(t1.getName());

        try {
            t1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        for (int itr = 1; itr <= 5; itr++) {
            System.out.println("Main Process " + itr);
        }
    }
}