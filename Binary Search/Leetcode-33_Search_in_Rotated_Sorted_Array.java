/*
Runtime 0 ms - Beats 100%
Memory 41.8 MB - Beats 75.20%

Search an element in a circularly sorted array

Given a circularly sorted integer array, search an element in it. Assume there are no duplicates in the array, and the rotation is in the anti-clockwise direction.

For example,
Input: nums = [8, 9, 10, 2, 5, 6]  target = 10
Output: Element found at index 2
 
Input: nums = [9, 10, 2, 5, 6, 8]  target = 5
Output: Element found at index 3
*/
class HelloWorld {
    public static int solution(int [] nums, int target){
        int start = 0;
        int end = nums.length - 1;
        
        while ( start <= end ){
            
            int mid = start + ( end - start ) / 2;
            if ( target == nums[mid] ){
                return mid;
            }            
            if ( nums[ mid ] <= nums[ end ]){
                if ( target >= nums[ mid ] && target <= nums[ end ]){
                    start = mid + 1;
                }
                else {
                    end = mid - 1;
                }
            }
            else {
                if ( target <  nums[ mid ] && target >= nums[ start ]){
                    end = mid - 1;
                }
                else {
                    start = mid + 1;
                }
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int [] nums = { 8, 9, 10, 11, 12, 1, 2, 3, 4, 5, 6, 7 };
        System.out.println(" Target is at " + solution(nums, 6) + ".");
    }
}
