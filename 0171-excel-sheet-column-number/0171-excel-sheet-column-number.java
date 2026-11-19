class Solution {
    public int titleToNumber(String columnTitle) {
        int ans = 0;
        for(char ch : columnTitle.toCharArray()){
            ans = ans * 26 + (ch - 'A' + 1);
        }
        return ans;
    }
}