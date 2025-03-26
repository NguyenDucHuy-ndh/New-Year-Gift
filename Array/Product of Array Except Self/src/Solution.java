class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] answer = new int[nums.length];

        long product = 1;
        int zero = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                product = product * nums[i];
            } else {
                zero++;
            }

        }

        for (int i = 0; i < answer.length; i++) {
            if (nums[i] != 0 && zero < 1) {
                answer[i] = (int) product / nums[i];
            } else if (zero > 1) {
                answer[i] = 0;
            } else if (nums[i] == 0 && zero == 1) {
                answer[i] = (int)product;
            }
        }

        return answer;
    }
}