class Solution {
    public int maxSubArray(int[] nums) {
        int n = nums.length;
        if (n == 0) return 0; // Handle edge case where array is empty

        int maxi = nums[0]; // Initialize to the first element of the array
        int currentSum = nums[0]; // Initialize current sum with the first element

        for (int i = 1; i < n; i++) {
            // Update current sum, either starting fresh from current element or adding it to the existing sum
            currentSum = Math.max(nums[i], currentSum + nums[i]);
            // Update maximum sum if current sum is greater
            maxi = Math.max(maxi, currentSum);
        }

        return maxi;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] nums = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };
        int maxSum = sol.maxSubArray(nums);
        System.out.println("The maximum subarray sum is: " + maxSum);
    }
}
