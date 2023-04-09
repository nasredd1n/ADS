public class problem3 {
    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        } else if (n == 2) {
            return true;
        } else {
            return isPrimeRecursive(n, 2);
        }
    }

    private static boolean isPrimeRecursive(int n, int i) {
        if (i == n) {
            return true;
        } else if (n % i == 0) {
            return false;
        } else {
            return isPrimeRecursive(n, i + 1);
        }
    }
}
