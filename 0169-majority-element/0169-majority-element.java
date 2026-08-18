class Solution {
    public int majorityElement(int[] nums) {
        int vote = 0;
        int can = 0;
        for(int i = 0;i<nums.length;i++){
            if(vote == 0){
                can = nums[i];
            }
            if(can == nums[i]){
                vote++;
            }
            else{
                vote--;
            }
        } 
        return can;
    }
}