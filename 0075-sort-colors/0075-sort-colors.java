class Solution {
    public void sortColors(int[] nums) {
        int st = 0;
        int mid = 0;
        int high = nums.length - 1;

        while(mid <= high){
            if(nums[mid] == 0){
                int temp = nums[st];
                nums[st] = nums[mid];
                nums[mid] = temp;
                st++;
                mid++;
            }
            else if(nums[mid] == 1){
                mid++;
            }
            else if(nums[mid] == 2){
                int temp = nums[high];
                nums[high] = nums[mid];
                nums[mid] = temp;
                high--;
                
            }
        }
    }
}