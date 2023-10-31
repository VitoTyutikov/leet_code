package org.lc.LeetCode_75;

public class Increasing_Triplet_Subsequence {

    public static void main(String[] args) {
        increasingTriplet(new int[] { 20, 100, 10, 12, 5, 13 });
    }

    static public boolean increasingTriplet(int[] nums) {
        boolean res = false;
        

        for (int i = 0, j = i + 1, k = i + 2; i < nums.length - 2 && !res; i++) {
            if (nums[i] < nums[j] && nums[j] < nums[k]) {
                res = true;
            }
        }
        return res;

    }
}
