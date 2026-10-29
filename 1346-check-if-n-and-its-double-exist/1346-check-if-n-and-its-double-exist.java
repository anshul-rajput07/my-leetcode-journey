class Solution {
    public boolean checkIfExist(int[] arr) {
        HashSet<Integer> hash = new HashSet<>();
        for(int i = 0;i < arr.length;i++){
            if(hash.contains(arr[i] * 2) || (arr[i] % 2 == 0 && hash.contains(arr[i] / 2))){
                return true;
            }else{
            hash.add(arr[i]);
            }
        }
        
        return false;
    }
}