class Solution {
    public int minChanges(String s) {
        int i = 0;
        int count = 0;
        while(i + 1 < s.length()){
            if(s.charAt(i) != s.charAt(i + 1)){
                count++;
            }
            i += 2;
        }
        return count;
    }
}