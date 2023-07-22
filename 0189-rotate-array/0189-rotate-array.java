class Solution {
    public void rotate(int[] nums, int k) {
        int[] copy = new int[nums.length];
        for(int i=0; i<nums.length; i++) {
            copy[i] = nums[i];
        }
        for(int i=0; i<nums.length; i++) {
            nums[(i+k) % nums.length] = copy[i];
        }
    }
}

// class Solution {
//     public void rotate(int[] nums, int k) {
//         // int beforeTmp = nums.length > 1 ? nums[k-1] : nums[0];
//         int tmpIndex = k % nums.length;
//         int tmp = nums[tmpIndex];
        
//         // int j=0;
//         for(int i=0; i<nums.length; i++) {
//             // nums[(j+k) % nums.length] = nums[j];
//             // j = (j+k+1) % nums.length;
            
//             tmpIndex = (tmpIndex+k) % nums.length;
//             int oldTmp = tmp;
//             tmp = nums[tmpIndex];
//             nums[tmpIndex] = oldTmp;
//         }
        
//         // nums[(k+k) % nums.length] = tmp;
//         // nums[(k+k-1) % nums.length] = beforeTmp;
//     }
// }