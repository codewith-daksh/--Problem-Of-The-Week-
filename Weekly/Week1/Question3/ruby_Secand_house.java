import java.util.Scanner;

public class PaintHouseII {

    /**
     * Calculates the minimum painting cost such that no two adjacent houses have the same color.
     * Uses dynamic programming with optimized tracking of minimum and second minimum values.
     *
     * @param costs 2D array where costs[i][j] is the cost of painting house i with color j
     * @return Minimum cost to paint all houses under given constraints
     */
    public int minCostII(int[][] costs) {
        int n = costs.length;
        if (n == 0) return 0;

        int k = costs[0].length;
        if (k == 0) return 0;

        // Indices of the least and second least costs from the previous row
        int min1 = -1, min2 = -1;

        for (int i = 0; i < n; i++) {
            int lastMin1 = min1, lastMin2 = min2;
            min1 = -1;
            min2 = -1;

            for (int j = 0; j < k; j++) {
                if (i > 0) {
                    // Add cost from previous house, excluding same color as lastMin1
                    if (j != lastMin1) {
                        costs[i][j] += costs[i - 1][lastMin1];
                    } else {
                        // If same color as lastMin1, use the second minimum instead
                        costs[i][j] += costs[i - 1][lastMin2];
                    }
                }

                // Update current row's min1 and min2 indexes
                if (min1 == -1 || costs[i][j] < costs[i][min1]) {
                    min2 = min1;
                    min1 = j;
                } else if (min2 == -1 || costs[i][j] < costs[i][min2]) {
                    min2 = j;
                }
            }
        }

        // Final minimum cost will be at the last row, index min1
        return costs[n - 1][min1];
    }

    /**
     * Main method for testing input from console.
     * Reads number of houses and colors, followed by the cost matrix.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read number of houses and number of colors
        int n = scanner.nextInt();
        int k = scanner.nextInt();

        // Initialize and read the cost matrix
        int[][] costs = new int[n][k];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < k; j++) {
                costs[i][j] = scanner.nextInt();
            }
        }

        // Output the result using the optimized function
        System.out.println(new PaintHouseII().minCostII(costs));
    }
}
