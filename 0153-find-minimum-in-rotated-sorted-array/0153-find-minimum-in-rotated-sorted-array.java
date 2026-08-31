class Solution {
    public int findMin(int[] nums) {
        int right = nums.length-1;
       int left = 0;
       int ans = -1;
       int length = nums.length;
       while(left<=right){
        int mid = left + (right-left)/2;
        if (nums[mid]<=nums[length-1]){
            ans = mid;
            right = mid - 1 ;
        }
        else{
            left  = mid + 1;
        }
       }
       return nums[ans];
        
    }
}