package Recursion;

public class tiling {
    public static int tilingWays(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        else {
            return tilingWays(n - 1) + tilingWays(n - 2);
        }
    }
    public static void main(String[] args) {
        System.out.println(tilingWays(4));
    }
}
