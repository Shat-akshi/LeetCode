import java.util.Arrays;

class Solution {
    public void setZeroes(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;
        boolean col0 = false; // To keep track of whether the first column should be zeroed

        // Step 1: Traverse the matrix and mark the first row and first column accordingly
        for (int i = 0; i < n; i++) {
            if (matrix[i][0] == 0) col0 = true;
            for (int j = 1; j < m; j++) {
                if (matrix[i][j] == 0) {
                    matrix[i][0] = 0;
                    matrix[0][j] = 0;
                }
            }
        }

        // Step 2: Use the markers to set elements to zero
        for (int i = 1; i < n; i++) {
            for (int j = 1; j < m; j++) {
                if (matrix[i][0] == 0 || matrix[0][j] == 0) {
                    matrix[i][j] = 0;
                }
            }
        }

        // Step 3: Zero the first row if needed
        if (matrix[0][0] == 0) {
            for (int j = 1; j < m; j++) {
                matrix[0][j] = 0;
            }
        }

        // Step 4: Zero the first column if needed
        if (col0) {
            for (int i = 0; i < n; i++) {
                matrix[i][0] = 0;
            }
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[][] matrix = {
            {1, 1, 1},
            {1, 0, 1},
            {1, 1, 1}
        };

        solution.setZeroes(matrix);

        System.out.println("The Final matrix is: ");
        for (int[] row : matrix) {
            System.out.println(Arrays.toString(row));
        }
    }
}
