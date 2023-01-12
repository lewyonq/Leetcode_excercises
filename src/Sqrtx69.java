public class Sqrtx69 {
    public static void main(String[] args) {
        System.out.println(mySqrt(2147395600));
        System.out.println(Math.sqrt(2147395600));
    }

    static int mySqrt(int x) {
        if(x == 0 || x == 1) return x;

        long l = 0, r = x, mid = 0;
        while(l < r) {
            mid = l + ((long) r - l + 1) / 2;
            if (mid * mid <= (long) x) {
                l = mid;
            } else {
                r = mid - 1;
            }
        }
        return (int) l;
    }
}
