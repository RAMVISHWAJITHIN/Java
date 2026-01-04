import java.util.HashMap;

public class LargestSubArrayWithZeroSum {

    public static int subArraySum(int[] arr) {
        HashMap<Integer, Integer> mpp = new HashMap<Integer, Integer>();
        int maxi = 0;
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
            if (sum == 0) {
                maxi = i + 1;
            } else {
                if (mpp.get(sum) != null) {
                    maxi = Math.max(maxi, i - mpp.get(sum));
                } else {
                    mpp.put(sum, i);
                }
            }
        }
        return maxi;

    }

    public static void main(String[] args) {
        int[] arr = { 1, -1, 3, 2, -2, -8, 1, 7, 10, 23 };
        System.out.println(subArraySum(arr));

    }

}
