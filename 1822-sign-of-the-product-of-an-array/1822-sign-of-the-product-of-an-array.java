class Solution {
    public int arraySign(int[] nums) {
        int x = 1;
        for(int i:nums){
            if(i == 0){
                return 0;
            }
            else if(i<0){
                x *= -1;
            }
            else if(i>0){
                x *= 1;
            }
        }
        return x;
    }
}