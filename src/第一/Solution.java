package 第一;

public class Solution {
    int[] s = new int[]{4,1,2,1,2};

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.singleNumber(solution.s));

    }
    public  int singleNumber(int[] nums) {
        int a=0;
        for (int i = 0; i <= nums.length-1; i++) {
            for (int j = 0; j <= nums.length-1; j++) {
                if (i == j) {
                    continue;
                }
                if (nums[i] == nums[j]) {
                    break;
                }
                a=nums[i];
            }
        }
        return a;
    }
}