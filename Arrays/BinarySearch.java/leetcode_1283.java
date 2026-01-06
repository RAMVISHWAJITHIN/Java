/*
1283. Find the Smallest Divisor Given a Threshold

Given an array of integers nums and an integer threshold, we will choose a positive integer divisor, divide all the array by it, and sum the division's result. Find the smallest divisor such that the result mentioned above is less than or equal to threshold.

Each result of the division is rounded to the nearest integer greater than or equal to that element. (For example: 7/3 = 3 and 10/2 = 5).

The test cases are generated so that there will be an answer.

 

Example 1:

Input: nums = [1,2,5,9], threshold = 6
Output: 5
Explanation: We can get a sum to 17 (1+2+5+9) if the divisor is 1. 
If the divisor is 4 we can get a sum of 7 (1+1+2+3) and if the divisor is 5 the sum will be 5 (1+1+1+2).

| Divisor | Division Results | Sum  |
| ------- | ---------------- | ---- |
| 1       | 1+2+5+9          | 17 ❌ |
| 2       | 1+1+3+5          | 10 ❌ |
| 3       | 1+1+2+3          | 7 ❌  |
| 4       | 1+1+2+3          | 7 ❌  |
| 5       | 1+1+1+2          | 5 ✅  |

Example 2:

Input: nums = [44,22,33,11,1], threshold = 5
Output: 44
*/
public class leetcode_1283 {

    public static int smallestDivisor(int[] nums, int threshold) {

        int left = 1;
        int right = getMax(nums);

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (isPossible(nums, threshold, mid)) {
                right = mid - 1; // try smaller divisor
            } else {
                left = mid + 1; // need bigger divisor
            }
        }
        return left;
    }

    private static boolean isPossible(int[] nums, int threshold, int divisor) {
        int sum = 0;

        for (int num : nums) {
            sum += (num + divisor - 1) / divisor; // ceiling division
            if (sum > threshold)
                return false;
        }
        return true;
    }

    private static int getMax(int[] nums) {
        int max = nums[0];
        for (int num : nums) {
            max = Math.max(max, num);
        }
        return max;
    }

    public static void main(String[] args) {
        // [1,2,5,9], threshold = 6
        int[] nums = { 1, 2, 5, 9 };
        int threshold = 6;
        System.out.println(smallestDivisor(nums, threshold));
    }
}
