package Day12;
    import java.util.Scanner;


public class Problem8 {

    static void main() {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
        char key = sc.next().charAt(0);

        int i;
        for(i=0;i<str.length();i+=1)
        {
            if(str.charAt(i)==key)
                break;
        }
        if(i<str.length())
            System.out.println("element found");
        else System.out.println("Not");
sc.close();




    }
}


    