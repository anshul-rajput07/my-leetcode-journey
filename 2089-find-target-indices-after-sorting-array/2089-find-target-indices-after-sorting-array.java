class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        int s = 0;
        for(int i = 0; i<nums.length;i++){
            if(nums[i] == target){
                s++;
            }
        }
        List<Integer> numbers = new ArrayList<>();
        int min1 = 0;
        for(int i = 0;i<nums.length;i++){
            if(nums[i]<target){
                min1++;
            }
        }
        for (int i = 0 ; i<s;i++){
           numbers.add(i,min1+i);
        }
        return numbers;
    }
}