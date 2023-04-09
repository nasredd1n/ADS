public class problem9 {
    public static int binomialCoefficient(int n, int k) {
        if (k == 0 || k == n) {
            return 1;
        }
        int prevCoefficient = binomialCoefficient(n - 1, k - 1);
        int currentCoefficient = binomialCoefficient(n - 1, k);
        return prevCoefficient + currentCoefficient;
    }
}