class Solution {
    public boolean judgeSquareSum(int c) {
         if(c == 0){ return true;}

        for(int i = 1; i <= (int)Math.sqrt(c); i++){
            int d = c - (i * i);
            if(d < c && ((int)Math.sqrt(d) * (int)Math.sqrt(d) == d)){
                return true;
            }
        }
        return false;
    }
}