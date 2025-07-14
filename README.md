# -Problem-Of-The-Week-

# 💡 Problem Name: Subarray Sum Equals K

## 🧩 Problem Statement
Given an integer array `arr[]` and a target value `k`, find the total number of continuous subarrays whose sum equals to `k`.

---

## 🚀 Approach 1: Brute-Force Using Nested Loops

### 🔍 Logic Overview
We iterate over every possible subarray using two loops:
- Outer loop fixes the starting index `i`
- Inner loop iterates from `i` to the end and computes the cumulative sum `s`
- If at any point `s == k`, we increment our count `c`

This checks every subarray and directly adds to the answer if it satisfies the condition.

### ⏱️ Time Complexity
- Worst Case: `O(n²)` — because we check all subarrays

### 🧮 Space Complexity
- `O(1)` — No extra space is used

### ✅ Strengths
- Very intuitive and easy to debug
- Good for small datasets and dry-run understanding

### ❌ Weaknesses
- Not efficient for large input sizes (e.g., `n > 10^4`)
- Recalculates sums for overlapping subarrays

---

## 🧪 Sample Test Cases

| Input               | k | Output |
|--------------------|---|--------|
| `[1,1,1]`           | 2 | `2`    |
| `[1,2,3]`           | 3 | `2`    |
| `[3,4,7,-2,2,1,4,2]`| 7 | `4`    |

---

## 🧠 Edge Cases Handled
- Array with negative numbers
- Array with all elements as 0
- Single element equal to k
- Multiple overlapping subarrays with sum k

---

## 🛠️ Dry-Run Insight

### Example: `[1, 2, 1, 3]`, `k = 3`

- Start at index `0`: subarrays → `[1]`, `[1,2]`, `[1,2,1]`, `[1,2,1,3]`
- Start at index `1`: subarrays → `[2]`, `[2,1]`, `[2,1,3]`
- And so on...

Each cumulative sum is checked, and whenever it equals `k`, counter is incremented.

---

## ✍️ Personal Notes
- This approach helped clarify nested iteration logic
- While inefficient, it's useful for building debugging confidence
- Preparing the dry-run manually enhanced understanding of subarray boundaries

---

## 🗂 Related Topics
- Arrays
- Prefix Sum (for optimized versions)
- Hash Maps (used in `O(n)` solution)

## 🔄 Update Log
- `14-07-2025`: Brute-force logic implemented using nested loops
- `14-07-2025`: README created and test cases added
