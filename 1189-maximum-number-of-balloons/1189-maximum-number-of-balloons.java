class Solution {
    public int maxNumberOfBalloons(String text) {
        int[] arr = new int[5];
        for(char c : text.toCharArray()){
            if(c == 'b'){
                arr[0]++;
            } else if(c == 'a'){
                arr[1]++;
            } else if(c == 'l'){
                arr[2]++;
            } else if(c == 'o'){
                arr[3]++;
            } else if(c == 'n'){
                arr[4]++;
            }
        }
        arr[2] /= 2;
        arr[3] /= 2;

        int ans = Integer.MAX_VALUE;

        for (int count : arr) {
            ans = Math.min(ans, count);
        }

        return ans;
    }
}