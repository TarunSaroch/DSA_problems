// Binary Search Java implementation
// time complexity : O(log n)
// space complexity : O(1)

public class BinarySearchExample {
    public static int binarySearch(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5};
        int target = 4;

        int index = binarySearch(nums, target);

        if (index != -1) {
            System.out.println("Found target at index : " + index);
        } else {
            System.out.println("Target not found");
        }
    }
}
