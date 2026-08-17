class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        
        List<Integer> numbers = new ArrayList<>();
        int min1 = 0,max1 = 0;
        for(int i = 0;i<nums.length;i++){
            if(nums[i]<target){
                min1++;
            }
            else if(nums[i]>target){
                max1++;
            }
        }
        for (int i = 0 ; i<nums.length - min1- max1;i++){
           numbers.add(i,min1+i);
        }
        return numbers;
    }
}