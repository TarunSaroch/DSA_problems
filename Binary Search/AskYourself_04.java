/*
Find Pivot Element of a Sorted and Rotated Array.

Input : 9, 10, 1, 2, 3, 4, 5, 6
output : Pivot element is at index : 2

Input : 9, 10, 11, 5, 7, 8
output : Pivot element is at index : 3

Input : 7, 8, 9, 10, 11, 1, 2, 3, 4, 5, 6
output : Pivot element is at index : 5
*/

class Main {
    public static int findPivot( int [] nums ){
        int start = 0;
        int end = nums.length - 1;
        
        while (start <= end ){
            
            int mid = start + ( end - start ) / 2;
            int prev = (mid - 1 + nums.length) % nums.length;
            int next = (mid + 1) % nums.length;
            
            if ( nums[ mid ] < nums[ prev ] && nums[ mid ] < nums[ next]){
                return mid;
            }
            else if (nums[ mid ] < nums[ end ]){
                end = mid - 1;
            }
            else{
                start = mid + 1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int [] nums = { 9, 10, 1, 2, 3, 4, 5, 6};
        System.out.println( "Pivot element is at index : " + findPivot( nums ) );
    }
}
