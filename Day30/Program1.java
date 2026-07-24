package Day30;
import java.util.*;
public class Program1 {
public class Main {
    public static void main(String[] args) {
        int[] greed = {1, 2, 3};
        int[] cookies = {1, 1};

        Arrays.sort(greed);
        Arrays.sort(cookies);

        int child = 0, cookie = 0;

        while (child < greed.length && cookie < cookies.length) {
            if (cookies[cookie] >= greed[child]) {
                child++;
            }
            cookie++;
        }

        System.out.println("Content Children = " + child);
    }
}
    
}
