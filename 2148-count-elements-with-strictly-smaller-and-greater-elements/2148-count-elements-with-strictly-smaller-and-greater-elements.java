class Solution {
    public int countElements(int[] nums) {
        int max = nums[0];
        int min = nums[0];
        for(int i : nums){
            if(max < i){
                max = i;
            }
            if(min > i){
                min = i;
            }
        }
        int count = 0;
        for(int i : nums){
            if(i < max && i > min){
                count++;
            }
        }
        return count;
    }

}