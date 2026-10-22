class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int sum = 0;
        for(int i = 0;i<k;i++){
            sum+=nums[i];
        }
        int sum1 = sum;
        for(int i = k;i<nums.length;i++){
            int s = sum - nums[i - k] + nums[i];
            sum1 = Math.max(sum1,s);
            sum = s;
        }
        return (double)sum1/k;
    }
}