class Solution {
    public String reverseStr(String s, int k) {
        char[] ch = s.toCharArray();
        for(int i = 0 ; i < ch.length ; i += 2 * k){
            int j = Math.min(i + k - 1,ch.length - 1);
            int m = i;
            while(m < j){
                char temp = ch[m];
                ch[m] = ch[j];
                ch[j] = temp;
                j--;
                m++;
            }
        }
        return new String(ch);
    }
}