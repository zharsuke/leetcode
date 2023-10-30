class Solution {
    public int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[] {i, j};
                }
            }
        }
        return null;
    }

    public static void main(String[] args) {
        int[] num = {2,7,11,15};
        int target = 9;
        int[] result = new Solution().twoSum(num, target);
        System.out.println(result[0] + " " + result[1]);
    }
}