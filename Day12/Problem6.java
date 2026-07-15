package Day12;

import java.util.Scanner;


public class Problem6 {
    
    static void main() {
        Scanner sc = new Scanner(System.in);
       /* String str1 = "hello";
        String str2 = "Hello";*/
        String str1 = new String("hello");
        String str2 = new String("hello");

       /* String str2 = new String("training");
        String str3 = input.nextLine();*/
        if(str1.equals(str2))
            System.out.println("equal");
        else System.out.println("Not");
    sc.close();

    }
}