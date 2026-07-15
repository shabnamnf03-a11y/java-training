package Day12;

public class Problem7 {
    public static void main(String[] args) {
    
        String str1 ="hello world";
        String str2 ="Hello";
        System.out.println(str1);
        System.out.println(str2);
        
       
        String str3 ="this is string programming";

        String[] text = str3.split("i");

        int itr;
        for(itr=0;itr<text.length;itr+=1)
            System.out.println(text[itr]);
    }
}

