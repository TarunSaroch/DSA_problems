"""
Runtime 19 ms - Beats 83.98%
Memory 13.5 MB - Beats 40.73%

Given a non-negative integer x, return the square root of x rounded down to the nearest integer. The returned integer should be non-negative as well.
You must not use any built-in exponent function or operator.
For example, do not use pow(x, 0.5) in c++ or x ** 0.5 in python.

Example 1:
Input: x = 4   Output: 2
Explanation: The square root of 4 is 2, so we return 2.

Example 2:
Input: x = 8   Output: 2
Explanation: The square root of 8 is 2.82842..., and since we round it down to the nearest integer, 2 is returned.
"""

class Solution(object):
    def mySqrt(self, x):
        start = 1
        end = x

        while( start <= end ):

            mid = start + ( end - start ) / 2
            if( mid == x / mid ):
                return mid
            elif( mid > x / mid ):
                end = mid - 1
            else:
                start = mid + 1
        return end
