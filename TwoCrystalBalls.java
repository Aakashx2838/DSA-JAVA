public class TwoCrystalBalls {
    public static int twoCrystalBalls(Boolean[] arr) {
        int jump = (int) Math.floor(Math.sqrt(arr.length));

        int i = jump;
        for (; i < arr.length; i += jump) {
            if (arr[i] == true) {
                break;
            }
        }

        i -= jump;

        for (int j = 0; j <= jump && i < arr.length; j++, i++) {
            if (arr[i]) {
                return i;
            }
        }
        return -1;
    }
}
