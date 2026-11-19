class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        ArrayList<Integer> list = new ArrayList<>();
        HashMap<Integer,Integer> hash = new HashMap<>();
        for(int i : nums1){
            int count = hash.getOrDefault(i , 0);
            hash.put(i, count + 1);
        }
        for(int i : nums2){
            if(hash.containsKey(i) && hash.get(i) > 0){
                hash.put(i,hash.get(i) - 1);
                list.add(i);
            }
        }
        int[] arr = new int[list.size()];
        int idx = 0;
        for(int i : list){
            arr[idx++] = i;
        }
        return arr;
    }
}