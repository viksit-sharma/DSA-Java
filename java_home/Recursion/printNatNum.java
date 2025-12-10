package Recursion;
import java.util.*;
public class printNatNum {
    public static int printer(int n) {
        if (n == 0) {
            return 1;
        }
        int i = printer(n - 1);
        if (i == 1 && n != num) {
            System.out.print(n + " ");
            return i;
        }
        System.out.print(n);
        return 0;
    }

    static int num=0;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        num = n;
        printer(n);
    }
}
