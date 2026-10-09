class Solution {
    public int minInsertions(String s) {
        int res = 0;
        int count = 0;

        for(int i = 0;i<s.length();i++){
            char ch = s.charAt(i);
            if(ch == '('){
                if(count % 2 == 1){
                    res++;
                    count--;
                }
                count += 2;
            }else{
                count--;
                if(count < 0){
                    res++;
                    count += 2;
                }
            }

        } 
        return count + res;
    }
}