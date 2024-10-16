package pp_BasedQuestions;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class MaximumSubarraySum{
	public static void main(String[] args) {
        int[] arr = {5, -2, 4, 1, -1, 2, -3, 6, -4, 2};
        
        System.out.println(maximumSum(arr)); // Output: 9
    }

    public static int maximumSum(int[] arr) {
        int n = arr.length;
        int[] dp0 = new int[n];
        int[] dp1 = new int[n];
        
        dp0[0] = arr[0];
        dp1[0] = 0;
        int maxSum = arr[0];
        
        for (int i = 1; i < n; i++) {
            dp0[i] = Math.max(dp0[i - 1] + arr[i], arr[i]);
            dp1[i] = Math.max(dp1[i - 1] + arr[i], dp0[i - 1]);
            maxSum = Math.max(maxSum, Math.max(dp0[i], dp1[i]));
        }
        
        return maxSum;
    }
}
