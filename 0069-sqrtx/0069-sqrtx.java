class Solution {
    public int mySqrt(int x) {
        if(x == 1 || x == 0){
            return x;
        }

        int st = 1;
        int mid = 0;
        int end = x;
        while(st <= end){
            mid = st + (end - st) / 2;
            
            if((long)mid * mid > x){
                end = mid - 1;
            } else if((long)mid * mid == 0){
                return mid;
            } else{
                st = mid + 1;
            }
           
        }
        return end;
    }
}