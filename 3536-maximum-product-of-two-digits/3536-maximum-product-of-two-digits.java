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
        Arrays.sort(arr);
        return arr[s-1] * arr[s-2];
    }
}