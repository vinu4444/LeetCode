import java.util.*;
class Solution {
    static int gcd(int a, int b) {
        if (b == 0) return Math.abs(a);
        return gcd(b, a % b);
    }
    static int gcdArray(int[] arr) {
        int g = 0;
        for (int v : arr) {
            g = gcd(g, v);
        }
        return g;
    }
    public int minOperations(int[] nums, int[] numsDivide) {
        Arrays.sort(nums);
        int gcdValue = gcdArray(numsDivide);
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) continue;
            if (gcdValue % nums[i] == 0) {
                return i;
            }
        }
        return -1;
    }
}
