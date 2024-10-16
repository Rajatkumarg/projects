package pp_BasedQuestions;

public class LongestIncreasingSubsequence  {
	public static void main(String[] args) {
        int[] nums1 = {10, 9, 2, 5, 3, 7, 101, 18};
        int[] nums2 = {0, 1, 0, 3, 2, 3};
        int [] nums3 = {1,2,2,3,3};
        
        System.out.println(lengthOfLIS(nums1)); //4
        System.out.println(lengthOfLIS(nums2)); //4
        System.out.println(lengthOfLIS(nums3)); //3
    }

    public static int lengthOfLIS(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        
        int[] dp = new int[nums.length];
        int maxLength = 1;
        
        for (int i = 0; i < nums.length; i++) {
            dp[i] = 1;
            for (int j = 0; j < i; j++) {
                if (nums[i] > nums[j]) {
                    dp[i] = Math.max(dp[i], dp[j] + 1);
                }
            }
            maxLength = Math.max(maxLength, dp[i]);
        }
        return maxLength;
    }
}
