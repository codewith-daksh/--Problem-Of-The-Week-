🏡 Paint House II - README
📘 Problem Statement
Given n houses and k colors, each house can be painted with one of the k colors. Painting house i with color j costs costs[i][j]. You must paint all houses such that no two adjacent houses have the same color.
Your task is to minimize the total cost of painting all houses.

🚀 Solutions Overview
We implement two approaches to solve the problem:
- 🐢 Brute-force Dynamic Programming
- ⚡ Optimized DP using min1 and min2 tracking

🐢 Brute-Force DP Approach
🔍 Description
This solution uses a basic DP table where for each house and each color, we compare all possible previous colors (excluding the current one) to maintain the constraint.
📊 Time & Space Complexity
- Time: O(n × k²)
- Space: O(n × k)
💡 Pros
- Easy to understand
- Good for initial learning and debugging
🧱 Core Logic
dp[i][j] = min(costs[i][j] + dp[i-1][m]) for all m ≠ j



⚡ Optimized DP Approach (min tracking)
🔍 Description
This method smartly tracks only the minimum and second minimum cost from the previous row, avoiding unnecessary comparisons.
📊 Time & Space Complexity
- Time: O(n × k)
- Space: O(1) (in-place update)
✅ Pros
- Fast and scalable
- Efficient for larger inputs
🧠 Core Insight
- For each color:
- Use min1 cost if previous color ≠ current
- Use min2 cost if previous color == current
- Track new min1 and min2 as you go

🧪 Sample Input Format
n k
costs[0][0] costs[0][1] ... costs[0][k-1]
...
costs[n-1][0] costs[n-1][1] ... costs[n-1][k-1]


🖨️ Example
3 3
1 5 3
2 9 4
3 6 1



📁 File Structure Suggestions
PaintHouseII/
├── README.md
├── PaintHouseII_Optimized.java
└── PaintHouseII_BruteForce.java




