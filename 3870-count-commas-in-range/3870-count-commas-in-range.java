class Solution {
    public int countCommas(int n) {
        int dig = (int)Math.log10(n) + 1;
        if(dig < 4){
            return 0;
        }else{
            return (n-999);
        }
    }
}