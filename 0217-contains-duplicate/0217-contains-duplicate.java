class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> hash = new HashSet<>();
        for(int i : nums){
            if(!hash.add(i)){
                return true;
            }
        }
        return false;
    }
}