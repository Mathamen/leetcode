package medium.q50;


class Q50 {
    public double myPow(double x, int n) {
        if (x == 0) {
            if (n == 0) {
                throw new IllegalArgumentException("Undefined result for 0^0");
            } else {
                return 0;
            }
        }

        double result = 1.0;
        long absN = Math.abs((long) n); 

        while (absN > 0) {
            if (absN % 2 == 1) {
                result *= x;
            }
            x *= x;
            absN /= 2;
        }

        return (n < 0) ? 1 / result : result;
    }
}
