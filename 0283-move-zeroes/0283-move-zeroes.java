class Solution {
    public void moveZeroes(int[] nums) {
        int i = 0;
        while(i<nums.length && nums[i]!=0){
                i++;
        }
        int j = i + 1;
        while(i<nums.length && j < nums.length){
            
            if(nums[j] != 0){
                int temp = nums[j];
                nums[j] = 0;
                nums[i] = temp;
                i++;
            }
            j++;
        }
       
    }
}