//Approch-1 Added brute-force solution for Subarray Sum Equals K)

import java.util.*;

class Solution {
    
       public int subarraySum(int[] arr, int k) {
        int c = 0; // To store final count of valid subarrays

        // Outer loop: fix starting index of subarray
        for (int i = 0; i < arr.length; i++) {
            int s = 0; // Initialize sum for the current subarray

          // Inner loop: iterate from i to end and keep adding elements
            for (int j = i; j < arr.length; j++) {
                s += arr[j]; // Add current element to subarray sum

                // If current subarray sum equals k, increment count
                if (s == k) {
                    c++;
                }
            }
        }

        return c; // Return total count of matching subarrays
    }

    // Main method to test the subarraySum method
    public static void main(String[] args) {
        Solution sol = new Solution();

        // Sample input array and target sum k
        int[] arr = {1, 2, 3, -1, 1};
        int k = 3;

        // Calling the method and printing the result
        int result = sol.subarraySum(arr, k);
        System.out.println("Total subarrays with sum " + k + ": " + result);
    }
}
