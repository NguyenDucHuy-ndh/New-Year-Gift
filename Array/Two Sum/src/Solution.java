class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] a = new int[2];
        for (int i = 0; i < nums.length - 1; i++) {
            boolean find = false;
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    a[0] = i;
                    a[1] = j;
                    find = true;
                    break;
                }
            }
            if (find) {
                break;
            }
        }

        return a;
    }
}