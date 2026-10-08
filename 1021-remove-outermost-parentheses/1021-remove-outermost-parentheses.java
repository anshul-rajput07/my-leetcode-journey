class Solution {
    public String removeOuterParentheses(String s) {
        int left = 0 , right = 0;
        String ans = "";
        String res = "";
        for(int i = 0; i < s.length();i++){
            if(s.charAt(i) == '('){
                left ++;
                ans+="(";

            }else if(s.charAt(i) == ')'){
                right++;
                ans+=")";
            }

            if(left == right){
                res += ans.substring(1,ans.length() - 1);
                ans = "";
            }
        }
        return res;
    }
}