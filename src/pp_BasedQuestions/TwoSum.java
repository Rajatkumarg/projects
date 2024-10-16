package pp_BasedQuestions;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum   {
	public static void main(String[] args) {
        int[] nums1 = {2, 7, 11, 15};
        int[] nums2 = {3, 2, 4};
        
        int target1 = 9;
        int target2 = 6;
        
        System.out.println(Arrays.toString(twoSum(nums1, target1))); // Output: [0, 1]
        System.out.println(Arrays.toString(twoSum(nums2, target2))); // Output: [1, 2]
    }

    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                return new int[]{map.get(complement), i};
            }
            map.put(nums[i], i);
        }
        throw new IllegalArgumentException("No two sum solution");
    }
}
