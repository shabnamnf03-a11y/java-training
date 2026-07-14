package Day23;
import java.util.*;
public class Problem1 {
    public int numJewelsInStones(String jewels, String stones) {
        HashSet<Character> set = new HashSet<>();
        for (char c : jewels.toCharArray())
            set.add(c);

        int count = 0;
        for (char c : stones.toCharArray())
            if (set.contains(c))
                count++;

        return count;
    }
}
    
