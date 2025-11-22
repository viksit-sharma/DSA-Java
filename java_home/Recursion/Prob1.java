package Recursion;
public class Prob1 {
    public static void printToN(int x) {
        if (x == 1) {
            System.out.print(x);
            return;
        }
        System.out.print(x + " ");
        printToN(x-1);
    }
    public static void main(String[] args) {
        printToN(10);
    }
}
