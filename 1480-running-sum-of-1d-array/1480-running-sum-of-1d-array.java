class Solution {
    public int[] runningSum(int[] nums) {
        int[] arr = new int[nums.length];
        int idx = 0;
        int sum = 0;
        for(int i:nums){
            sum+=i;
            arr[idx] = sum;
            idx++;
        }
        return arr;
    }
}