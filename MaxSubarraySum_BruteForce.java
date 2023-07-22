public class MaxSubarraySum_BruteForce {
    public static void MaxSubarraySum(int numbers[]) {
        int maxSum = Integer.MIN_VALUE;
        int currSum = 0;

        for (int i = 0; i < numbers.length; i++) {
            int start = i;
            for (int j = i; j < numbers.length; j++) {
                int end = j;
                currSum = 0;
                for (int k = start; k <= end; k++) {
                    currSum = currSum + numbers[k];
                }
                System.out.println(currSum);

                if (currSum > maxSum) {
                    maxSum = currSum;
                }

            }
        }
        System.out.println("Max sum is: " + maxSum);
    }

    public static void main(String args[]) {
        int numbers[] = { 2, 4, 6, 8, 10 };
        MaxSubarraySum(numbers);
    }
}
