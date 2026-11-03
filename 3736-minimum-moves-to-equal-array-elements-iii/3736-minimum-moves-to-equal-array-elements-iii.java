class Solution {
    public int minMoves(int[] nums) {
        int max = 0;
        for(int i : nums){
            if(i > max){
                max = i;
            }
        }
        int sum = 0;
        for(int i : nums){
            sum += (max - i); 
        }
        return sum;
    }
}