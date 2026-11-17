class Solution {
    public String destCity(List<List<String>> paths) {
        HashMap<String,String> hash = new HashMap<>();
        for(int i = 0 ; i < paths.size() ; i++){
            hash.put(paths.get(i).get(0),paths.get(i).get(1));
        }
        String s = "";
        for(String i : hash.keySet()){
            if(!hash.containsKey(hash.get(i))){
                s = hash.get(i);
            }
        }
        return s;
    }
}