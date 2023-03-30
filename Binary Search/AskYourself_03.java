/*
Find the first or last occurrence of a given number in a sorted array.

Given a sorted integer array, find the index of a given number’s first or last occurrence. If the element is not present in the array, report that as well.

For example,
Input: nums = [2, 5, 5, 5, 6, 6, 8, 9, 9, 9]       target = 5 
Output:
The first occurrence of element 5 is located at index 1
The last occurrence of element 5 is located at index 3

Input: nums = [2, 5, 5, 5, 6, 6, 8, 9, 9, 9]       target = 4
Output:
-1
*/

class HelloWorld {
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
            
            if ( target < nums[ mid ]){
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
        int result = 0;
        while ( start <= end ){
            
            int mid = start + ( end - start ) / 2;
            
            if ( target == nums[mid] ){
                result = mid;
                start = mid + 1;
            }
            
            if ( target < nums[ mid ]){
                end = mid - 1;
            }
            else {
                start = mid + 1;
            }
        }
        return result;
    }
    
    public static void main(String[] args) {
        int [] nums = { 2, 5, 5, 5, 6, 6, 8, 9, 9, 9 };
        System.out.println(" First Occurence is at " + FirstOcc(nums, 6) + ".");
        System.out.println(" Last Occurence is at " + LastOcc(nums, 6) + ".");
        
    }
}
