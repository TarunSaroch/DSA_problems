"""
Find Pivot Element of a Sorted and Rotated Array.

Input : 9, 10, 1, 2, 3, 4, 5, 6
output : Pivot element is at index : 2

Input : 9, 10, 11, 5, 7, 8
output : Pivot element is at index : 3

Input : 7, 8, 9, 10, 11, 1, 2, 3, 4, 5, 6
output : Pivot element is at index : 5
"""
def findPivot ( nums ):
    
    start =  0
    end = len(nums) - 1
    
    while ( start <= end ):
        
        mid = start + ( end - start ) // 2
        nex = (mid + 1) % len( nums )
        prev = (mid - 1 + len( nums ) ) % len( nums )
        
        if ( nums[ mid ] < nums [ nex ] and nums[ mid ] < nums[ prev] ):
            return mid
        
        elif ( nums[ mid ] >= nums[ start ] ):
            start = mid + 1
        
        else:
            end = mid - 1
    
    return -1
    
nums = [ 9, 10, 11, 12, 1, 2, 3, 4, 5, 6 ]
print( "Pivot is at index", findPivot( nums ) )
