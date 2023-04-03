"""
Runtime 16 ms - Beats 98.86%
Memory 13.8 MB - Beats 15.14%

Search an element in a circularly sorted array

Given a circularly sorted integer array, search an element in it. Assume there are no duplicates in the array, and the rotation is in the anti-clockwise direction.

For example,
Input: nums = [8, 9, 10, 2, 5, 6]  target = 10
Output: Element found at index 2
 
Input: nums = [9, 10, 2, 5, 6, 8]  target = 5
Output: Element found at index 3

"""


def solution( nums, target ):
    start = 0
    end = len( nums ) - 1
    
    while ( start <= end ):
        
        mid = start + ( end - start ) // 2
        
        if ( target == nums[ mid ] ):
            return mid        
        if ( nums[ mid ] <= nums[ end ]):
            if ( target >= nums[ mid ]  and target <= nums[ end ]):
                start = mid + 1
            else:
                end = mid - 1
        else:
            if ( target <= nums[ mid ] and target >= nums[ start ]):
                end = mid - 1
            else:
                start = mid + 1
    return -1

nums = [8, 9, 10, 1, 2, 3, 4, 5, 6, 7]
target = 4
print(f'Target is at index', solution( nums, target ))
