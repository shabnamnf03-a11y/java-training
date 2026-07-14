package Day10;

public class Problem10 {
    public static void main(String[] args) {
        UPI u = new UPI();
        u.pay();
    }
}
interface Payment {
    void pay();
}
class UPI implements Payment {
    public void pay() {
        System.out.println("UPI Payment");
    }
}