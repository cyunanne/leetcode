import java.util.Map;
import java.util.HashMap;

class Solution {
    public int majorityElement(int[] nums) {
        
        Map<Integer, Integer> map = new HashMap<>();
        int max = nums[0];
        int maxCount = 0;
        for(int n : nums) {
            int cur = map.get(n) == null ? 0 : map.get(n);
            map.put(n, cur + 1);
            
            if(cur == maxCount) {
                maxCount++;
                max = n;
            }
        }
        
        return max;
    }
}