class Solution {
    public int singleNumber(int[] nums) {
        int n = 0;
        for(int i = 0;i<nums.length;i++){
            n^=nums[i];
        }
        return n;
    }
}