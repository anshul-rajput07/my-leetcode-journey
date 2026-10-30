class Solution {
    public int[] shortestToChar(String s, char c) {
        int i = 0;
        int j = 0;
        int  n = s.length();
        int[] arr = new int[n];
        ArrayList<Integer> value = new ArrayList<>();

        while(i<n){
            if(s.charAt(i) == c){
                value.add(i);
            }
            i++;
        }
        
        while(j<n){
                arr[j] = Math.abs(value.get(0) - j);
                for(int m : value){
                    arr[j] = Math.min(arr[j],Math.abs(m - j));
                }
                j++;
            
        }
        return arr;
    }
}