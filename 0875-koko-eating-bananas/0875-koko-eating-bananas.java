class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int left = 1;
        int right = Arrays.stream(piles).max().getAsInt();
        int ans = right;
        while(left <= right){
            int mid = left + (right - left) / 2;
            long hours = 0;
            for(int pile : piles){
                hours += pile / mid;
                if(pile % mid != 0){ 
                    hours++;
                }
            }
            if(hours <= h){
                right = mid - 1;
                ans = mid;
            }
            else{
                left = mid + 1;
            }

        }
        return ans;
    }
}