class Solution {
    public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
        Arrays.sort(arr2);
        int count = 0;
        for(int i : arr1){
            int left = 0;
            int right = arr2.length - 1;

            while(left <= right){
                int mid = left + (right- left) / 2;
                if(Math.abs(i - arr2[mid]) <= d){
                    count++;
                    break;
                }
                if(arr2[mid] < i){
                    left = mid + 1;

                }else{
                    right = mid - 1;
                }
                
            }
        }
        return arr1.length - count;

    }
}