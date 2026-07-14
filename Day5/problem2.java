package Day5;

import java.util.Scanner;

public class problem2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double buyPrice = sc.nextDouble();
        double sellPrice = sc.nextDouble();
        int quantity = sc.nextInt();
        double result = (sellPrice - buyPrice)*quantity;
        if (result > 0)
            System.out.println("Profit = " + result);
        else if (result < 0)
            System.out.println("Loss = " + (-result));
        else 
             System.out.println("No Profit No Loss");
        sc.close();
    }
}
