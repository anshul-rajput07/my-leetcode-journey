class Solution {
    public int pivotIndex(int[] nums) {
        int[] sumright = new int[nums.length];
        int[] sumleft = new int[nums.length];
        int right = 0;
        int left = 0;
        for(int i = nums.length - 1; i >= 0 ; i--){
            right += nums[i];
            sumright[i] = right;
            left += nums[nums.length - 1 - i];
            sumleft[nums.length - 1 - i] = left;
        }
        for(int i = 0 ; i < nums.length ; i++){
            if(sumright[i] == sumleft[i]){
                return i;
            }
        }
        return -1;
    }
}