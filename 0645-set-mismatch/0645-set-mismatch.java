class Solution {
    public int[] findErrorNums(int[] nums) {
        int n = nums.length;
        Map<Integer,Integer> map = new HashMap<>();
        int count = 0;
        int ans = 0;
        int sum = 0;
        int[] arr = new int[2];
        for(int i : nums){
            count = map.getOrDefault(i,0);
            map.put(i,count + 1);
            sum += i;
        }
        for(int i : map.keySet()){
            if(map.get(i) > 1){
                ans = i;
            }
        }
        sum -= ans;
        arr[0] = ans;
        arr[1] = (n * (n + 1) / 2) - sum;

        return arr;
         

        
    }
}