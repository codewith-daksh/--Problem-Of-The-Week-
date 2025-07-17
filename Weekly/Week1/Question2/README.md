# Find Minimum in Array 🧮

 * Brute Force Steps:
  - Assume the first element of the array is the minimum (m = nums[0])
- Loop through the entire array using a for loop
- Compare each element — if a smaller value is found, update m
- After the loop ends, return m

- 
* Time & Space Complexity:
- Time: O(n) — you check each element once
- Space: O(1) — no extra memory is used
----------------------------------------------------------------------------------------------------------------------------------------------------------------

* Optimal Approach: Binary Search

This approach is simple and reliable, especially when the array is not sorted. But if the array is sorted and rotated,
then you can optimize the solution using binary search, reducing time complexity to O(log n).


The idea is based on finding the inflection point—the spot where the rotation happens and the smallest element sits.
 Steps:
- Set low = 0 and high = nums.length - 1
- While low < high:
- Find mid = low + (high - low) / 2
- If nums[mid] > nums[high], that means the smallest value is to the right of mid → low = mid + 1
- Else, the smallest value could be at mid or to the left → high = mid
- After the loop, low will point to the minimum value

 Time & Space Complexity:
- Time: O(log n)
- Space: O(1)
