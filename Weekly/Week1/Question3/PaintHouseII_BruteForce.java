import java.util.Scanner;

public class PaintHouseII {

    /**
     * Brute force dynamic programming approach to find minimum cost to paint houses
     * Ensures adjacent houses don’t share the same color by checking all possibilities
     */
    public int minCostII(int[][] costs) {
        int n = costs.length;
        if (n == 0) return 0;
        
        int k = costs[0].length;
        if (k == 0) return 0;

        // Create a DP table to hold cumulative costs
        int[][] dp = new int[n][k];

        // Copy the first row
        for (int j = 0; j < k; j++) {
            dp[0][j] = costs[0][j];
        }

        // Fill DP table from house 1 to n-1
        for (int i = 1; i < n; i++) {
            for (int j = 0; j < k; j++) {
                dp[i][j] = Integer.MAX_VALUE;
                for (int m = 0; m < k; m++) {
                    if (m != j) {
                        // Choose a different color from the previous house
                        dp[i][j] = Math.min(dp[i][j], costs[i][j] + dp[i - 1][m]);
                    }
                }
            }
        }

        // Find the minimum cost from the last house
        int result = Integer.MAX_VALUE;
        for (int j = 0; j < k; j++) {
            result = Math.min(result, dp[n - 1][j]);
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int[][] costs = new int[n][k];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < k; j++) {
                costs[i][j] = scanner.nextInt();
            }
        }

        System.out.println(new PaintHouseII().minCostII(costs));
    }
}
