class Solution {
    public boolean isSubsequence(String s, String t) {
        int s_size = s.length();
        int t_size = t.length();
        int  i = 0;
        int j = 0 , count = 0 ;
        while(i < s_size && j < t_size){
            if(s.charAt(i) == t.charAt(j)){
                count++;
                i++;
            }
            j++;
        }
        return count == s_size;
    }
}