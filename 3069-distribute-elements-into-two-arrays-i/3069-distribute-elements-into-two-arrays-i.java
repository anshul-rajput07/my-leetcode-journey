class Solution {
    public int[] resultArray(int[] nums) {
        int n = nums.length;
        int[] arr1 = new int[n];
        int[] arr2 = new int[n];
        int arr1point = 0 , arr2point = 0;
        arr1[0] = nums[0];
        arr2[0] = nums[1];

        for(int i = 2;i<n;i++){
            if(arr1[arr1point]>arr2[arr2point]){
                arr1point++;
                arr1[arr1point] = nums[i];
                
            }
            else{
                arr2point++;
                arr2[arr2point] = nums[i];
                
            }
        }
        for(int i = 0;i<=arr2point;i++){
            arr1point++;
            arr1[arr1point] = arr2[i];
            
        }
        return arr1;

        
    }
}