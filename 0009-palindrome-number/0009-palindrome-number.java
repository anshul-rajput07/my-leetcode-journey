class Solution {
    public boolean isPalindrome(int x) {
        int n = x;
        int sum = 0;
        if(n<0){
            return false;
        }
        while(x!=0){
            int rem = x % 10;
            sum = sum * 10 + rem;
            x /= 10;
        }
        
        return n == sum;
    }
}