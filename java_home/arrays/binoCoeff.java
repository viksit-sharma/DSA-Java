package java_home.arrays;
import java.util.Scanner;

public class binoCoeff {

    public static int fact(int x) {

        int fac = 1;

        for (int i = 1; i <= x; i++) {
            fac = i * fac;
        }
        return fac;
    }

    public static int binoCoef(int n,int r) {
        int nume = fact(n);

        int deno = (fact(n - r) * fact(r));

        return nume / deno;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n : ");
        int n = sc.nextInt();

        System.out.print("Enter r : ");
        int r = sc.nextInt();

        System.out.println("The binomial coefficient of " +n + "-C-" + r +" is : "+ binoCoef(n,r));
    }
}