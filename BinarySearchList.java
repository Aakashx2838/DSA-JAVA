public class BinarySearchList {
    public static boolean binarySearch(int[] arr, int search) {
        int low = 0;
        int high = arr.length;

        do {
            int middle = (int) Math.floor(low + (high - low) / 2);
            int value = arr[middle];

            if (value == search) {
                return true;
            } else if (value > search) {
                high = middle;
            } else if (value < search) {
                low = middle + 1;
            }
        } while (low < high);

        return false;
    }
}
