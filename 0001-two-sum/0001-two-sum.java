class Solution {
    public int[] twoSum(int[] nums, int target) {
      int j = 0,n = nums.length;
      int[] r = new int[2];
      while(j<n){
      for(int i = j+1 ; i < n ; i++){
        if(nums[i] + nums[j] == target){
            r[0] = i;
            r[1] = j;
            return r;
        }
      }  
      j++;}
      return r;
    }
}