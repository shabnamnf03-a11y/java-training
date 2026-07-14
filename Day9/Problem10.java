package Day9;

public class Problem10 {
    public static void main(String[] args) {
         int n = 1234, count = 0;

while(n > 0) {
    count++;
    n /= 10;
}

System.out.println(count);
    }
   
    
}