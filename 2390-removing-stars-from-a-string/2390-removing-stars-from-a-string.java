class Solution {
    public String removeStars(String s) {
        Stack<Character> st = new Stack<>();
        int n = s.length();
        for(int i = 0;i<n;i++){
            char ch = s.charAt(i);
            if(ch == '*'){
                st.pop();
            }else{
                st.push(ch);
            }
        }
        String s1 = "";
        
        for(char ch : st){
            s1 += ch;
        }
        return s1;
    }
}