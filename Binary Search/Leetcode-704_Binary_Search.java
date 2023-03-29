/*
Runtime 0 ms - Beats 100%
Memory 43.8 MB - Beats 9.10%
*/
class Solution {
    public int search(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;
        int mid = start + (end - start)/2;
        while ( start <= end ){
            if ( nums[mid] == target ) return mid;
            else if ( nums[mid] < target ) start = mid + 1;
            else end = mid -1;
            mid = start + (end - start)/2;
        }
        return -1;
    }
}
