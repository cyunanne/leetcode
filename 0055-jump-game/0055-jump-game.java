class Solution {
    
    // 89ms, 44.4mb
    public boolean canJump(int[] nums) {
        boolean[] reachable = new boolean[nums.length];
        reachable[nums.length-1] = true;
        
        for(int i=nums.length-2; i>=0; i--) {
            for(int j=nums[i]; j>0; j--) {
                int nextIdx = i + j;
                if(nextIdx >= nums.length || reachable[nextIdx]) {
                    reachable[i] = true;
                    break;
                }
            }
        }
        
        return reachable[0];
    }
}