package Day11;

public class Problem6 {
    public static void main(String[] args) {

        Animal a = new Animal() {

            public void sound() {
                System.out.println("Meow");
            }
        };

        a.sound();
    }
}

interface Animal {
    void sound();
}