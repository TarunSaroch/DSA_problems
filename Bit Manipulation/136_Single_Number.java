/*
Runtime 1 ms - Beats 100%
Memory 42.2 MB - Beats 88.8%

https://leetcode.com/problems/single-number/

Given a non-empty array of integers nums, every element appears twice except for one. Find that single one.
You must implement a solution with a linear runtime complexity and use only constant extra space.

Example 1:
Input: nums = [2,2,1]    Output: 1

Example 2:
Input: nums = [4,1,2,1,2]    Output: 4

Example 3:
Input: nums = [1]     Output: 1

*/

class Solution {
    public int singleNumber(int[] nums) {
        int i = 0;
        int ans = 0;
        while(i < nums.length){
            ans ^= nums[i];
            i++;
        }
        return ans;
    }
}
