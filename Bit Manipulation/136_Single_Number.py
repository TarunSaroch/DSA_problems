"""
Runtime 93 ms - Beats 92.83%
Memory 15.6 MB - Beats 64.42%

https://leetcode.com/problems/single-number/

Given a non-empty array of integers nums, every element appears twice except for one. Find that single one.
You must implement a solution with a linear runtime complexity and use only constant extra space.

Example 1:
Input: nums = [2,2,1]    Output: 1

Example 2:
Input: nums = [4,1,2,1,2]    Output: 4

Example 3:
Input: nums = [1]     Output: 1
"""

class Solution(object):
    def singleNumber(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        ans = 0
        for i in nums:
            ans ^= i
        return ans
