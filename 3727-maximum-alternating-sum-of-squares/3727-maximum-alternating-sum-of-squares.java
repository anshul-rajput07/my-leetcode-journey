class Solution {
    public long maxAlternatingSum(int[] nums) {
        int n = nums. length / 2;
        for(int i = 0 ; i < nums.length;i++){
            if(nums[i] < 0){
                nums[i] *= -1;
            }
        }

        Arrays.sort(nums);
    
        long res = 0;
        for(int i = 0;i < n;i++){
            res -= nums[i] * nums[i];
        }
        for(int i = n ;i < nums.length;i++){
            res += nums[i] * nums[i];
        }
        return res;
        
    }
}