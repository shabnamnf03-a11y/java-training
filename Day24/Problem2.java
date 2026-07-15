package Day24;
import java.util.*;
public class Problem2 {


class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> ans = new ArrayList<>();

        if (s.length() < p.length())
            return ans;

        int[] count = new int[26];

        for (char c : p.toCharArray())
            count[c - 'a']++;

        int left = 0, right = 0;

        while (right < s.length()) {
            count[s.charAt(right) - 'a']--;

            while (count[s.charAt(right) - 'a'] < 0) {
                count[s.charAt(left) - 'a']++;
                left++;
            }

            if (right - left + 1 == p.length())
                ans.add(left);

            right++;
        }

        return ans;
    }
}
    
}
