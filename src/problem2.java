public class problem2 {
    public static double findAverageRecursive(int[] arr, int n) {
        if (n == 0) {
            return 0;
        } else {
            double prevAvg = findAverageRecursive(arr, n - 1);
            return (prevAvg * (n - 1) + arr[n - 1]) / n;
        }
    }
}
