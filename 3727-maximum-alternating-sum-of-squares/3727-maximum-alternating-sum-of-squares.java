class Solution {
    public long maxAlternatingSum(int[] nums) {
        int n = nums. length / 2;
        long[] arr = new long[nums.length];
        for(int i = 0 ; i < nums.length;i++){
            arr[i] = (long)nums[i] * nums[i];
        }

        Arrays.sort(arr);
    
        long res = 0;
        for(int i = 0;i < n;i++){
            res -= arr[i];
        }
        for(int i = n ;i < nums.length;i++){
            res += arr[i];
        }
        return res;
        
    }
}