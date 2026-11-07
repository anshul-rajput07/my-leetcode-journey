class Solution {
    public String[] findRestaurant(String[] list1, String[] list2) {
        Map<String,Integer> hash = new HashMap<>();
        int count = 0;
        for(int i = 0; i < list1.length ; i++){
            hash.put(list1[i],i);
        }
        
        List<String> ans = new ArrayList<>();
        int min = Integer.MAX_VALUE;
        for(int i = 0 ; i < list2.length ; i++){
            if(hash.containsKey(list2[i])){
                count = hash.get(list2[i]);
                int total = count + i;
                if(total < min){
                    ans.clear();
                    ans.add(list2[i]);
                    min = total;
                }
                else if(total == min){
                    ans.add(list2[i]);
                }
            }
        }
        
        
        return ans.toArray(new String[0]);
    }
}