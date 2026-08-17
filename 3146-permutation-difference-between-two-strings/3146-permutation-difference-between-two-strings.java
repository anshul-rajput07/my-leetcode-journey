class Solution {
    public int findPermutationDifference(String s, String t) {
        int n = s.length();
        int m = 0;
        for(int i = 0;i<n;i++){
            for(int j = 0;j<n;j++){
                if(s.charAt(i) == t.charAt(j)){
                    m += Math.abs(i-j);
                }
            }
        }
        return m;
    }
}