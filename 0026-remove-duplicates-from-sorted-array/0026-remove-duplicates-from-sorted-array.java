class Solution {
    public int removeDuplicates(int[] nums) {
        int count = nums.length;
        for(int i=1; i<count;) {
            if(nums[i-1] != nums[i]) {
                i++;
                continue;
            }
            
            for(int j=i; j<count; j++) {
                nums[j-1] = nums[j];
            }
            
            count--;
        }
        
        return count;
    }
}