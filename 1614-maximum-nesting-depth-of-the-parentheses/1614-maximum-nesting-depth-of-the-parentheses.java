class Solution {
    public int maxDepth(String s) {
        int right = 0 , left = 0;
        int ans = 0;
        for (int i = 0; i < s.length() ; i++){
            if(s.charAt(i)==')'){
                right++;
            }else if(s.charAt(i) == '('){
                left++;
                ans = Math.max(left - right,ans);
            }
        }
        return ans;
    }
}