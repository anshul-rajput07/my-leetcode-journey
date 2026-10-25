class Solution {
    public String clearDigits(String s) {
        
        Stack<Character> st1 = new Stack<>();

        for(int i = 0; i < s.length() ; i++){
            char ch = s.charAt(i);
            if(ch < 65){
                if(st1.isEmpty()){
                    continue;
                }
                st1.pop();
            }else{
                st1.push(ch);
            }
        }
        String ans = "";
        for(char a : st1){
            ans += a;
        }
        return ans;
    }
}