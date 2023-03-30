"""
Find the number of rotations in a circularly sorted array.

Given a circularly sorted integer array, find the total number of times the array is rotated. Assume there are no duplicates in the array, and the rotation is in the anti-clockwise direction.

Input:  nums = [8, 9, 10, 2, 5, 6]                  Output: The array is rotated 3 times
Input:  nums = [2, 5, 6, 8, 9, 10]                  Output: The array is rotated 0 times
Input:  nums = [8, 9, 10, 11, 1, 2, 5, 6, 7]        Output: The array is rotated 4 times
"""

def solution( nums ):
    start = 0
    end = len( nums ) - 1
    
    while ( start <= end ):
        
        if ( nums[ start ] < nums[ end ] ):
            return mid
        
        mid = start + ( end - start ) // 2
        nex = ( mid + 1 ) % len( nums )
        prev = ( mid - 1 + len( nums ) ) % len( nums )
        
        if ( nums[ mid ] <= nums[ prev ] and nums[ mid ] <= nums[ nex ]):
            return mid
        
        elif ( nums[ mid ] <= nums[ end ]):
            end = mid - 1
        
        else:
            start = mid + 1
            
    return 0

nums = [8, 9, 10, 1, 2, 3, 4, 5, 6, 7]
print(f'The list is rotated ', solution( nums ),' times')
