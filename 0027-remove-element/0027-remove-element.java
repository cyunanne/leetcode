class Solution {
    public int removeElement(int[] nums, int val) {
        int count = nums.length;
        for(int i=0; i<count;) {
            if(nums[i] != val) {
                i++;
                continue;
            }
            for(int j=i+1; j<count; j++)
                nums[j-1] = nums[j];
            count--;
        }
        return count;
    }
}