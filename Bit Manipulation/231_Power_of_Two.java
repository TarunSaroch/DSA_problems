/*
Java code
Runtime 1 ms - Beats 100%
Memory 40.1 MB - Beats 18.14%

Given an integer n, return true if it is a power of two. Otherwise, return false.
An integer n is a power of two, if there exists an integer x such that n == 2x.

Example 1:    Input: n = 1 Output: true
Explanation: 20 = 1
Example 2:    Input: n = 16 Output: true
Explanation: 24 = 16
Example 3:    Input: n = 3 Output: false
*/

class Solution {
    public boolean isPowerOfTwo(int n) {
        if( n > 0 && (n & n-1) == 0 ) return true;
        return false;
    }
}

/*
Runtime 1 ms - Beats 100%
Memory 40.1 MB - Beats 57.71%
*/
class Solution {
    public boolean isPowerOfTwo(int n) {
        return n > 0 && (n & n - 1) == 0;
    }
}
