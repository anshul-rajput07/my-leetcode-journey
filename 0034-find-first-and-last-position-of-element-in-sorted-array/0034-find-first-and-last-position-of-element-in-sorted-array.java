class Solution {
    static int last(int[] nums,int target){
        int l = 0;
        int r = nums.length - 1;
        int ans = -1;
        while(l<=r){
            int mid = l + (r - l) / 2;
            if(nums[mid] == target){
                ans = mid;
                l = mid + 1;
            }else if(nums[mid] < target){
                l = mid + 1;
            }else{
                r = mid - 1;
            }
        }
        return ans;
    }
        static int first(int[] nums,int target){
        int l = 0;
        int r = nums.length - 1;
        int ans = -1;
        while(l<=r){
            int mid = l + (r - l) / 2;
            if(nums[mid] == target){
                ans = mid;
                r = mid - 1;
            }else if(nums[mid] < target){
                l = mid + 1;
            }else{
                r = mid - 1;
            }
        }
        return ans;
    }
    
    public int[] searchRange(int[] nums, int target) {
        int[] arr = new int[2];
        arr[0] = first(nums, target);
        arr[1] = last(nums, target);
        return arr;
        
        
    }
}