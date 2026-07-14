package Day10;

public class Problem4 {
    public static void main(String[] args) {
        Email e = new Email();
        e.send();

        SMS s = new SMS();
        s.send();
    }
}

interface Notification {
    void send();
}

class Email implements Notification {

    public void send() {
        System.out.println("Email Sent");
    }
}

class SMS implements Notification {

    public void send() {
        System.out.println("SMS Sent");
    }
}