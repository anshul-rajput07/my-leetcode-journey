class Solution {
    public int[] recoverOrder(int[] order, int[] friends) {
        int[] ans = new int[friends.length];
        HashSet<Integer> hash = new HashSet<>();
        for(int i : friends){
            hash.add(i);
        }
        int b = 0;
        for(int i: order){
            if(hash.contains(i)){
                ans[b++] = i;
            }
        }
        return ans;
    }
}