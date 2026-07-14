package Day10;

public class Problem5 {
    public static void main(String[] args) {
        Test.largest(10, 50, 30);
    }
}
class Test {
    static void largest(int... n) {
        int max = n[0];
        for (int i : n) {
            if (i > max)
                max = i;
        }
        System.out.println(max);
    }
}