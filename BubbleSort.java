public class BubbleSort {
    public static int[] bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) { // linearly looping throughh the array
            // linearly looping through the array until the ith element
            // substracted by 1 which is the last element which is always
            // ordered after each loop
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j + 1] < arr[j]) { // conditionally swapping elements based off indexes
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        return arr;
    }
}
