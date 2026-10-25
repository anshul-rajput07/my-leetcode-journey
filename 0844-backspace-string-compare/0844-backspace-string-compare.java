class Solution {
    public boolean backspaceCompare(String s, String t) {
        Stack<Character> st1 = new Stack<>();
        Stack<Character> st2 = new Stack<>();

        for(int i = 0; i < s.length() ; i++){
            char ch = s.charAt(i);
            if(ch == '#'){
                if(st1.isEmpty()){
                    continue;
                }
                st1.pop();
            }else{
                st1.push(ch);
            }
        }

        for(int j = 0; j < t.length() ; j++){
            char ch = t.charAt(j);
            if(ch == '#'){
                if(st2.isEmpty()){
                    continue;
                }
                st2.pop();
            }else{
                st2.push(ch);
            }
        }

        return st1.equals(st2);
    }
}