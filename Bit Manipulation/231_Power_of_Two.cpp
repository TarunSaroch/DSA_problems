/*
C++ code

Runtime 0 ms - Beats 100%
Memory 5.9 MB - Beats 62.34%

Given an integer n, return true if it is a power of two. Otherwise, return false.
An integer n is a power of two, if there exists an integer x such that n == 2x.

Example 1:    Input: n = 1 Output: true
Explanation: 20 = 1
Example 2:    Input: n = 16 Output: true
Explanation: 24 = 16
Example 3:    Input: n = 3 Output: false
*/
class Solution {
public:
    bool isPowerOfTwo(int n) {
        return n > 0 && not (n & n - 1);
    }
};
