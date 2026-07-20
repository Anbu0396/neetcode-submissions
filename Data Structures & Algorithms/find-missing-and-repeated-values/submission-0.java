class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {

        int n = grid.length;
        int total = n * n;

        long expectedSum = (long) total * (total + 1) / 2;
        long expectedSquareSum = (long) total * (total + 1) * (2L * total + 1) / 6;

        long actualSum = 0;
        long actualSquareSum = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                actualSum += grid[i][j];
                actualSquareSum += (long) grid[i][j] * grid[i][j];
            }
        }

        // missing - repeated
        long diff = expectedSum - actualSum;

        // missing² - repeated²
        long squareDiff = expectedSquareSum - actualSquareSum;

        // missing + repeated
        long sum = squareDiff / diff;

        int missing = (int) ((diff + sum) / 2);
        int repeated = (int) (sum - missing);

        return new int[]{repeated, missing};
    }
}