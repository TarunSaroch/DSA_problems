/*
Find the number of rotations in a circularly sorted array.

Given a circularly sorted integer array, find the total number of times the array is rotated. Assume there are no duplicates in the array, and the rotation is in the anti-clockwise direction.

Input:  nums = [8, 9, 10, 2, 5, 6]                  Output: The array is rotated 3 times
Input:  nums = [2, 5, 6, 8, 9, 10]                  Output: The array is rotated 0 times
Input:  nums = [8, 9, 10, 11, 1, 2, 5, 6, 7]        Output: The array is rotated 4 times
*/

class HelloWorld {
    public static int solution(int [] nums){
        int start = 0;
        int end = nums.length - 1;
        while ( start <= end ){
            if ( nums[ start ] <= nums [end] ){
                return start;
            }
            int mid = start = ( end - start ) / 2;
            int next = ( mid + 1 ) % (nums.length);
            int prev = ( mid - 1 + nums.length) % (nums.length);
            if ( nums[ mid ] <= nums [ next ] && nums[ mid ] <= nums[ prev ]){
                return mid;
            }
            else if ( nums[ mid ] <= nums [end] ){
                end = mid - 1;
            }
            else {
                start = mid + 1;
            }
        }
        return 0;
    }
    public static void main(String[] args) {
        int [] nums = { 8, 9, 10, 11, 1, 2, 5, 6, 7 };
        System.out.println(" Array is rotated " + solution(nums) + " times.");
    }
}
