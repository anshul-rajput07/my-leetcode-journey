class Solution {
    public boolean checkIfExist(int[] arr) {
        HashSet<Double> hash = new HashSet<>();
        for(int i = 0;i < arr.length;i++){
            if(hash.contains((double)arr[i] * 2) || hash.contains((double)arr[i] / 2)){
                return true;
            }else{
            hash.add((double)arr[i]);
            }
        }
        
        return false;
    }
}