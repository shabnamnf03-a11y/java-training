package Day11;

public class Problem9 {
    public static void main(String[] args) {

        Message m = new Message() {

            public void text() {
                System.out.println("Hello");
            }
        };

        m.text();
    }
}

interface Message {
    void text();
}