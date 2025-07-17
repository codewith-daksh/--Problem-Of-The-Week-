class MinSortArray {
    public int findMin(int[] nums) {
        int m = nums[0];
        for (int i = 0; i < nums.length; i++) {
            if (m > nums[i]) {
                m = nums[i];
            }
        }
        return m;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] nums = {4, 2, 7, 1, 9, 3};
        int min = sol.findMin(nums);
        System.out.println("Minimum value in the array is: " + min);
    }
}
