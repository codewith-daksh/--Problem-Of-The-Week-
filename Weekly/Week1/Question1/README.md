# 💡 Problem Name: Subarray Sum Equals K

## 🧩 Problem Statement
Given an integer array `arr[]` and an integer `k`, find the total number of continuous subarrays whose sum equals to `k`.

---

## 🚀 Approach 1: Brute-Force Using Nested Loops

### 🔍 Logic Overview
We iterate over every possible subarray using two loops:
- Outer loop fixes starting index `i`
- Inner loop adds elements till `j` and calculates cumulative sum
- If sum equals `k`, increase the counter

### ⏱️ Time Complexity
- `O(n²)` — checks all subarrays

### 📦 Space Complexity
- `O(1)` — no extra data structure used

### ✅ Pros
- Simple and easy to dry-run

### ❌ Cons
- Inefficient for large arrays

---

## ⚡ Approach 2: Optimized Using Prefix Sum + HashMap

### 🔍 Logic Overview
- Maintain a cumulative `prefix sum` while traversing the array
- Use a hashmap to store frequency of prefix sums
- At each index, check if `(prefixSum - k)` exists in map
  - If yes, add frequency to the result
- This means: we found a subarray ending at current index whose sum is `k`

### ⏱️ Time Complexity
- `O(n)` — single pass through array

### 📦 Space Complexity
- `O(n)` — for hashmap storing prefix sums

### ✅ Pros
- Efficient and scalable
- Works with negative numbers too

### ❌ Cons
- Slightly more complex logic

---

## 🧪 Sample Test Cases

| Input          | k | Output |
|----------------|---|--------|
| `[1,1,1]`       | 2 | `2`    |
| `[1,2,3]`       | 3 | `2`    |
| `[3,4,7,-2,2,1,4,2]` | 7 | `4` |

---

## 🧠 Edge Cases Handled
- Subarrays with negative values
- Multiple overlapping subarrays
- Zero-length subarrays (via hashmap trick)
- Prefix sum equal to `k` at start of array

---

## ✍️ Personal Notes
- Brute-force dry-run helped visualize how subarrays expand
- Prefix-sum logic taught how to use hashmap for efficient tracking
- This problem is perfect blend of intuition + optimization

---

## 🗂 Related Topics
- Arrays, Hash Maps
- Prefix Sum Patterns
- Sliding Window (alternative variant)

## 🔄 Update Log
- `14-07-2025`: Brute-force logic added
- `14-07-2025`: Optimized prefix sum approach implemented
- `14-07-2025`: README updated with dual approaches





