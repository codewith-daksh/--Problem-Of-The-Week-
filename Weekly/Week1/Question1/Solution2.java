import java.util.HashMap;

class Solution {

    public int subarraySum(int[] nums, int k) {
        int count = 0, sum = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, 1); // Handle subarrays starting from index 0

        for (int num : nums) {
            sum += num;

            // Check if there's a prefix sum that gives current sum - k
            if (map.containsKey(sum - k)) {
                count += map.get(sum - k);
            }

            // Record the current prefix sum
            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }

        return count;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        
        // Sample input
        int[] nums = {1, 2, 3, -1, 1};
        int k = 3;

        int result = sol.subarraySum(nums, k);
        System.out.println("Total subarrays with sum " + k + ": " + result);
    }
}
