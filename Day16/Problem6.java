package Day16;
    import java.util.*;

public class Problem6 {

public class RemoveDuplicates {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(1,2,3,2,4,3,5));

        LinkedHashSet<Integer> set = new LinkedHashSet<>(arr);

        System.out.println(set);
    }
}
    
}