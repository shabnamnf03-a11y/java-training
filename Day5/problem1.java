package Day5;
import java.util.*;
public class problem1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        for (int i = 1;i<=5;i++)
            sum +=sc.nextInt();
        double avg = sum / 5.0;
        System.out.println("Averge = "+ avg);
        if(avg >=90)
            System.out.println("Grade: o");
        else if(avg >= 80)
            System.out.println("Grade:A+");
        else if(avg >= 70)
            System.out.println("Grade:A");
        else if(avg >= 60)
            System.out.println("Grade:B+");
        else if(avg >= 50)
            System.out.println("Grade:B");
        else System.out.println("Grade:F");
        sc.close();
}
}
