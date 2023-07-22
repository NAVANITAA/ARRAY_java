public class largestnumber {
    public static int getLargest(int numbers[]) {
        int Largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > Largest) {
                Largest = numbers[i];
            }

            if (numbers[i] < smallest) {
                smallest = numbers[i];
            }
        }

        System.out.println("smallest value is: " + smallest);
        return Largest;
    }

    public static void main(String args[]) {
        int numbers[] = { 27, 4, 6, 88, 10, 612, 14, 16 };

        System.out.println("largest value is: " + getLargest(numbers));
    }
}
