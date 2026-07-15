package Day13;

// Custom Unchecked Exception
class InvalidAgeException1 extends RuntimeException {

    public InvalidAgeException1(String message) {
        super(message);
    }
}

public class Problem10 {

    static void validate(int age) {
        if (age < 18) {
            throw new InvalidAgeException1("Age is under 18");
        } else {
            System.out.println("Valid Age");
        }
    }

    public static void main(String[] args) {

        int age = 10;

        try {
            validate(age);
        } catch (InvalidAgeException1 e) {
            System.out.println(e.getMessage());
        }
    }
}