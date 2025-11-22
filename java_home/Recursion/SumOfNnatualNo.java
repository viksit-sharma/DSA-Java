package Recursion;

public class SumOfNnatualNo {
    public static int SumOfNnatualNos(int x) {
        if (x == 1) {
            return 1;
        }
        return x + SumOfNnatualNos(x - 1);
    }
    public static void main(String[] args) {
        System.out.println(SumOfNnatualNos(5));
    }
}
