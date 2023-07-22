public class binarySearch {

    public static int binarySearch(int numbers[], int key) {
        int start = 0;
        int last = numbers.length - 1;

        while (start <= last) {
            int mid = (start + last) / 2;

            if (numbers[mid] == key) {
                return mid;
            }

            if (numbers[mid] < key) {// right
                start = mid + 1;
            } else {
                last = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String args[]) {
        int numbers[] = { 2, 4, 6, 8, 10, 12, 14, 16 };
        int key = 12;

        System.out.println("key is at index: " + binarySearch(numbers, key));
    }
}
