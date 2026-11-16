class Solution {
    String digsum(String str){
        int i = 0;
        
        int n = str.length();
        int sum = 0;
        while(i < n){
            sum += str.charAt(i++) - '0';

        }
        return sum+"";
    }

    public String digitSum(String s, int k) {
        String str = "";
        int i = 0 , j = k;
        while(s.length() > k){
            
            str += digsum(s.substring(i,j));
            if(j == s.length()){
                i = 0 - k;
                j = 0;
                s = str;
                str = "";
            }
            i+=k;
            j+=k;
            if(j > s.length()){
                j = s.length();
            }
            
        }
        return s;
    }
}