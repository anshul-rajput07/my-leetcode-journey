class Solution {
    public int distributeCandies(int[] candyType) {
        int n = candyType.length;
        int limit = n/2;

        Set<Integer> st = new HashSet<>();
        for(int num : candyType){
            st.add(num);
            if(st.size() > limit) return limit; // early exit
        }

        return Math.min(limit, st.size());
    }
}