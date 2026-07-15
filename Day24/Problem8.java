package Day24;

public class Problem8 {
    class Solution {
    public int longestSubarray(int[] nums) {
        int left = 0, zeroCount = 0, ans = 0;

        for (int right = 0; right < nums.length; right++) {
            if (nums[right] == 0)
                zeroCount++;

            while (zeroCount > 1) {
                if (nums[left] == 0)
                    zeroCount--;
                left++;
            }

            ans = Math.max(ans, right - left);
        }

        return ans;
    }
}
    
}
