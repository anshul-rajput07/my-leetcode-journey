class Solution {
    public boolean checkIfPangram(String sentence) {
        int[] arr = new int[26];
        for(int i = 0 ; i < sentence.length() ; i++){
            arr[sentence.charAt(i) - 97]++;
        }
        for(int i : arr){
            if(i == 0){
                return false;
            }
        }
        return true;
    }
}