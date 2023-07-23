import java.util.*;

public class MaxSubarraySum_kadanes {
    public static void MaxSubArraySum_kadanes(int numbers[]) {
        int cs = 0;
        int ms = Integer.MIN_VALUE;

        for (int i = 0; i < numbers.length; i++) {
            cs = cs + numbers[i];

            if (cs < 0) {
                cs = 0;
            }

            ms = Math.max(ms, cs);
        }
        System.out.println("max sum is: " + ms);
    }

    public static void main(String args[]) {
        int numbers[] = { 1, -2, 6, -1, 3 };
        MaxSubArraySum_kadanes(numbers);
    }
}
