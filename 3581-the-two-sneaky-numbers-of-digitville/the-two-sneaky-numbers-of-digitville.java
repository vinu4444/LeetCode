import java.util.*;

class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        HashSet<Integer> seen = new HashSet<>();
        ArrayList<Integer> sneaky = new ArrayList<>();

        for (int num : nums) {
            if (seen.contains(num)) {
                sneaky.add(num);
            } else {
                seen.add(num);
            }
        }

        // Convert ArrayList to array
        int[] result = new int[sneaky.size()];
        for (int i = 0; i < sneaky.size(); i++) {
            result[i] = sneaky.get(i);
        }

        return result;
    }
}

