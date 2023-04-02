"""
Runtime 56 ms - Beats 90.59%
Memory 14.7 MB - Beats 21.82%

Given an array of integers nums sorted in non-decreasing order, find the starting and ending position of a given target value.
If target is not found in the array, return [-1, -1].
You must write an algorithm with O(log n) runtime complexity.

Input: nums = [5,7,7,8,8,10],    target = 8               Output: [3,4]
Input: nums = [5,7,7,8,8,10],    target = 6               Output: [-1,-1]
Input: nums = [],                target = 0               Output: [-1,-1]
"""

class Solution(object):
    def FirstOcc(self, nums, target):
        start, end, result = 0, len(nums) - 1, -1
        while start <= end:
            mid = start + (end - start) // 2
            if target == nums[mid]:
                result = mid
                end = mid - 1
            elif target < nums[mid]:
                end = mid - 1
            else:
                start = mid + 1
        return result
      
    def LastOcc(self, nums, target):
        start, end, result = 0, len(nums) - 1, -1
        while start <= end:
            mid = start + (end - start) // 2
            if target == nums[mid]:
                result = mid
                start = mid + 1
            elif target < nums[mid]:
                end = mid - 1
            else:
                start = mid + 1
        return result
      
    def searchRange(self, nums, target):
        return [self.FirstOcc(nums, target),self.LastOcc(nums, target)]
            
