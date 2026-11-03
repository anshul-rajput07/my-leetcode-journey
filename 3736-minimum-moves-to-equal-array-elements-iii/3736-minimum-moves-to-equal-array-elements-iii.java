class Solution {
    public int minMoves(int[] nums) {
        int max = nums[0];
        int sum = 0;
        for(int i : nums){
            if(i > max){
                max = i;
            }
            sum += i;
        }
        
        return max * nums.length - sum ;
    }
}