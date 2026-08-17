class Solution {
    public int maxProduct(int n) {
        int s = (int)Math.log10(n) + 1;
        int[] arr = new int[s];
        int i = 0;
        while(n != 0){
            int rem = n % 10;
            arr[i] = rem;
            n /= 10;
            i++;
        }
        if(s == 2) {
            return arr[0] * arr[1];
        }
        Arrays.sort(arr);
        return arr[s-1] * arr[s-2];
    }
}