package Day11;

public class Problem1 {

    public static void main(String[] args) {

        int result = add(10, 20, 30, 40);

        System.out.println("Sum = " + result);
    }

    static int add(int... arr) {

        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }

        return sum;
    }
}