/*
Based on LeetCode 34:
Find count of occurrences using first and last occurrence
arr = [1,2,2,2,2,3], target = 2
output = 4
asked in google ,amazon,zoho
*/

public class Count_Occurrences_of_Elements {

    public static int countOccurrences(int[] nums, int target) {

        int first = firstOccurrence(nums, target);
        int last = lastOccurrence(nums, target);

        // if target not found
        if (first == -1 || last == -1) {
            return 0;
        }

        return last - first + 1;
    }

    private static int firstOccurrence(int[] nums, int target) {
        int start = 0, end = nums.length - 1;
        int ans = -1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (nums[mid] == target) {
                ans = mid;
                end = mid - 1; // move left
            } else if (nums[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return ans;
    }

    private static int lastOccurrence(int[] nums, int target) {
        int start = 0, end = nums.length - 1;
        int ans = -1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (nums[mid] == target) {
                ans = mid;
                start = mid + 1; // move right
            } else if (nums[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] nums = { 1, 2, 2, 2, 2, 3 };
        int target = 2;

        System.out.println(countOccurrences(nums, target));
    }
}
