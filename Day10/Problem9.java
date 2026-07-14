package Day10;

public class Problem9 {
    public static void main(String[] args) {
        Bike b = new Bike();
        b.start();
    }
}
abstract class Vehicle {
    abstract void start();
}
class Bike extends Vehicle {
    void start() {
        System.out.println("Bike Start");
    }
}