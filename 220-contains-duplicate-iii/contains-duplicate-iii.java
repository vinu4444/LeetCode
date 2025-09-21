import java.util.*;
class Solution {
    public boolean containsNearbyAlmostDuplicate(int[] nums, int indexDiff, int valueDiff) {
        TreeSet<Long> set = new TreeSet<>();
        for (int i = 0; i < nums.length; i++) {
            long num = (long) nums[i];
            Long floor = set.floor(num + valueDiff);
            Long ceil = set.ceiling(num - valueDiff);
            if ((floor != null && floor >= num - valueDiff) ||
                (ceil != null && ceil <= num + valueDiff)) {
                return true;
            }
            set.add(num);
            if (set.size() > indexDiff) {
                set.remove((long) nums[i - indexDiff]);
            }
        }
        return false;
    }
}
