class Solution {
    public int missingMultiple(int[] nums, int k) {
        HashSet<Integer> hash = new HashSet<>();
        for(int n : nums){
            hash.add(n);
        }
        int k1 = k;
        while(hash.contains(k1)){
            k1+=k;
        }
        return k1;
    }
}