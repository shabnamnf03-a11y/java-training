package Day14;

public class Problem7 {
    public static void main(String[] args) {
        try {
            int[] arr = {1, 2};
            System.out.println(arr[3]);

            int b = 0;
            int a = 10 / b;
            System.out.println(a);

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array Error");
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic Error");
        }
    }
}