class Solution {
    public int reverse(int x) {
        int n = x;
        int ans = 0;
        int max_int = 2147483647;
        int min_int = -2147483648;

        while(x != 0){
            int rem = x % 10;
            if(max_int/10 < ans || min_int/10 > ans){
                return 0;
            }
            ans = ans * 10 + rem;
            x /= 10;
        }
        return ans;
    }
}