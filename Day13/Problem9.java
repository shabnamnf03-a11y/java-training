package Day13;

class ThreadClass extends Thread {

    @Override
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

public class Problem9 {

    public static void main(String[] args) {

        ThreadClass t1 = new ThreadClass();
        t1.start();

        for (int itr = 1; itr <= 5; itr++) {
            System.out.println("Main Process " + itr);
        }
    }
}