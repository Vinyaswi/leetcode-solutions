import java.util.Arrays;
import java.util.HashMap;

class Solution {
    public int longestSquareStreak(int[] nums) {
        HashMap<Integer, Integer> streakMap = new HashMap<>();
        int maxStreak = -1;

        // Sort the array to ensure we check in increasing order
        Arrays.sort(nums);

        for (int num : nums) {
            if (isPerfectSquare(num)) {
                int root = (int) Math.sqrt(num);
                // Continue the streak from the previous perfect square
                int streak = streakMap.getOrDefault(root, 0) + 1;
                streakMap.put(num, streak);
                maxStreak = Math.max(maxStreak, streak);
            } else {
                // If it's not a perfect square, reset its streak count
                streakMap.put(num, 1);
            }
        }
        if (maxStreak==1) return -1;
        else

        return maxStreak;
    }

    public boolean isPerfectSquare(int n) {
        if (n < 0) return false; // Negative numbers cannot be perfect squares
        int sqrt = (int) Math.sqrt(n);
        return sqrt * sqrt == n;
    }
}
