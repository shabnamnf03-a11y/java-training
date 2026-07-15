package Day11;

public class Problem4 {
    public static void main(String[] args) {

        Dog d = new Dog();

        d.sound();
    }
}

interface Animal {
    void sound();
}

class Dog implements Animal {

    public void sound() {
        System.out.println("Bark");
    }
}