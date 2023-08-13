class Solution {
    public boolean canJump(int[] nums) {
        boolean[] reachable = new boolean[nums.length];
        reachable[nums.length-1] = true;
        
        for(int i=nums.length-2; i>=0; i--) {
            for(int j=nums[i]; j>0; j--) {
                int nextIdx = i + j;
                if(nextIdx >= nums.length) continue;
                if(reachable[nextIdx]) {
                    reachable[i] = true;
                    break;
                }
                if(j == 0) reachable[i] = false;
            }
        }
        
        return reachable[0];
    }
}