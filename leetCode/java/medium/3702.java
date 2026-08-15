class Solution {
    public int longestSubsequence(int[] nums) {
        int a = nums[0];
        long s = (long)a;
        for(int i=1;i<nums.length;i++){
            a = a ^ nums[i];
            s = s+(long)nums[i];
        }
        if(s==0)return 0;
        if(a==0)return nums.length-1;
        return nums.length;
    }
}