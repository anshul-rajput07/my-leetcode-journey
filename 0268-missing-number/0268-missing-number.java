class Solution {
    public int missingNumber(int[] nums) {
        int n = 0;
        for(int i = 1;i<=nums.length;i++){
            n ^= i ^ nums[i-1];
        }
        return n;
    }
}