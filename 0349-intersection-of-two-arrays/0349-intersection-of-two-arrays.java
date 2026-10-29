class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> hash = new HashSet<>();
        HashSet<Integer> ans = new HashSet<>();
        for(int i : nums1){
            hash.add(i);
        }
        
        for(int i : nums2){
            if(hash.contains(i)){
                ans.add(i);
            }
        }
        int[] arr = new int[ans.size()];
        
        int b = 0;
        for(int i : ans){
            arr[b++] = i;
           
        }
        return arr;
    }
}