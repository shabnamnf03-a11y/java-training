package Day30;
import java.util.*;
public class Program3 {
    public static void main(String[] args) {

        int start[] = {1, 3, 0, 5, 8, 5};
        int finish[] = {2, 4, 6, 7, 9, 9};

        int n = start.length;

        Integer index[] = new Integer[n];

        for (int i = 0; i < n; i++)
            index[i] = i;

        Arrays.sort(index, (a, b) -> finish[a] - finish[b]);

        int count = 1;
        int last = index[0];

        System.out.print("Activities: " + last + " ");

        for (int i = 1; i < n; i++) {

            if (start[index[i]] >= finish[last]) {
                System.out.print(index[i] + " ");
                count++;
                last = index[i];
            }
        }

        System.out.println("\nMaximum Activities = " + count);
    }
}
    

