package Day14;

public class Problem6 {
    public static void main(String[] args) {
        try {
            String str = "Hello";
            System.out.println(str.length());
        } catch (NullPointerException e) {
            System.out.println("String is null");
        }
    }
}