class Solution {
    public String[] findRestaurant(String[] list1, String[] list2) {
        Map<String,Integer> hash = new HashMap<>();
        int count = 0;
        for(int i = 0; i < list1.length ; i++){
            hash.put(list1[i],i);
        }
        Map<String,Integer> hash2 = new HashMap<>();
        for(int i = 0 ; i < list2.length ; i++){
            if(hash.containsKey(list2[i])){
                count = hash.get(list2[i]);
                hash2.put(list2[i],count + i);
            }
        }
        int min = Integer.MAX_VALUE;
        for(int i : hash2.values()){
            if(i < min){
                min = i;
            }
        }
        List<String> ans = new ArrayList<>();
        int idx = 0;
        for(String i : hash2.keySet()){
            if(hash2.get(i) == min){
                ans.add(i);
            }
        }
        return ans.toArray(new String[0]);
    }
}