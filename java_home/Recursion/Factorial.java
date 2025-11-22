package Recursion;

public class Factorial {
    public static int fact(int a) {
        if (a == 0 || a == 1) {
            return 1;
        }
        else
            return fact(a - 1) * a;
    }
    public static void main(String[] args) {
        System.out.println("Factorial of 5 is : "+fact(5));
    }
}
