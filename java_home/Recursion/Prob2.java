package Recursion;

public class Prob2 {
    public static void printToN(int x) {
        if (x == 1) {
            System.out.print(x+" ");
            return;
        }
        printToN(x - 1);
        System.out.print(x+" ");
    }
    public static void main(String[] args) {
        printToN(10);
    }
}
