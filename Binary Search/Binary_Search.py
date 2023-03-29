def binary_search(nums, target):
    start = 0
    end = len(nums) - 1

    while start <= end:
        mid = start + (end - start) // 2

        if nums[mid] == target:
            return mid
        elif nums[mid] < target:
            start = mid + 1
        else:
            end = mid - 1

    return -1
  
nums = [1, 2, 3, 4, 5]
target = 4

index = binary_search(nums, target)

if index != -1:
    print("Found target at index", index)
else:
    print("Target not found")
