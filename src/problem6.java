public class problem6 {
    public static double power(double a, int n) {
        if (n == 0) {
            return 1;
        } else if (n == 1) {
            return a;
        } else if (n < 0) {
            return 1 / power(a, -n);
        } else {
            double halfPower = power(a, n / 2);
            if (n % 2 == 0) {
                return halfPower * halfPower;
            } else {
                return a * halfPower * halfPower;
            }
        }
    }
}
