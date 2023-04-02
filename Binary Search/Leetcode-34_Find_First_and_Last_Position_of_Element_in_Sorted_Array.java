/*
Runtime 0 ms - Beats 100%
Memory 45.4 MB - Beats 89.39%

Given an array of integers nums sorted in non-decreasing order, find the starting and ending position of a given target value.
If target is not found in the array, return [-1, -1].
You must write an algorithm with O(log n) runtime complexity.

Input: nums = [5,7,7,8,8,10],    target = 8               Output: [3,4]
Input: nums = [5,7,7,8,8,10],    target = 6               Output: [-1,-1]
Input: nums = [],                target = 0               Output: [-1,-1]
*/

class Solution {
        public static int FirstOcc(int [] nums, int target){
        int start = 0;
        int end = nums.length - 1;
        int result = -1;
        while ( start <= end ){
            
            int mid = start + ( end - start ) / 2;
            
            if ( target == nums[mid] ){
                result = mid;
                end = mid -1;
            }
            
            else if ( target <= nums[ mid ]){
                end = mid - 1;
            }
            else {
                start = mid + 1;
            }
        }
        return result;
    }
    
    public static int LastOcc(int [] nums, int target){
        int start = 0;
        int end = nums.length - 1;
        int result = -1;
        while ( start <= end ){
            
            int mid = start + ( end - start ) / 2;
            
            if ( target == nums[mid] ){
                result = mid;
                start = mid + 1;
            }
            
            else if ( target <= nums[ mid ]){
                end = mid - 1;
            }
            else {
                start = mid + 1;
            }
        }
        return result;
    }
    public int[] searchRange(int[] nums, int target) {
        int arr[] = new int[2];
        arr[0] = FirstOcc(nums,target);
        arr[1] = LastOcc(nums,target);
        return arr;
    }
}
