public class ClimbingStairs70 {
    public static void main(String[] args) {
        System.out.println(climbStairs(5));
    }

    static int climbStairs(int n) {
        //The same as fibonacci
        if(n == 0) return 0;
        if(n == 1) return 1;
        if(n == 2) return 2;

        int result = 0;
        int twoStairsAgo = 1;
        int oneStairAgo = 2;

        for(int i = 3; i <= n; i++) {
            result = twoStairsAgo + oneStairAgo;
            twoStairsAgo = oneStairAgo;
            oneStairAgo = result;
        }

        return result;
    }
}
