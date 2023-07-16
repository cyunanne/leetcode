class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int idx1 = 0, idx2 = 0;
        int[] result = new int[m+n];

        for(int i=0; i<m+n; i++) {
            if(idx1 == m) {
                result[i]= nums2[idx2++];
            } else if(idx2 == n) {
                result[i] = nums1[idx1++];
            } else {
                result[i] = nums1[idx1] < nums2[idx2] ? nums1[idx1++] : nums2[idx2++];
            }
        }

        for(int i=0; i<m+n; i++) {
            nums1[i] = result[i];
        }
    }
}