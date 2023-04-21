def linear_search( nums, target):
    i = 0
    for i in range ( 0, len( nums ) ):
        if nums[ i ] == target:
            return i
        i = i + 1
    return -1

nums = [ 1, 2, 3, 4, 5, 6 , 7, 8, 9, 10]
target = 10

index = linear_search( nums, target)

if index != -1:
    print("Found target at index", index)
else:
    print("Target not found")
