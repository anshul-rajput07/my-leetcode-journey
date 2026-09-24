class Solution {
    public int removeElement(int[] nums, int val) {
        int m = 0;
        for(int i : nums){
            if(val != i){
                nums[m++] = i;
            }
        }
        return m;
    }
}