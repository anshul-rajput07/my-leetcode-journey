class Solution {
    static int countbit(int n){
        int c = 0;
        while(n>0){
            c++;
            n = n & (n-1);
        }
        return c;
    }
    
    public int[] countBits(int n) {
        int[] arr = new int[n+1];
        for(int i = 0;i<n+1;i++){
            arr[i] = countbit(i);
        }
        return arr;
    }
}