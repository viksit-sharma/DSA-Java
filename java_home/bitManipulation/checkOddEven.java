package bitManipulation;

public class checkOddEven {
    public static void evenOdd(int number) {
    if((number&1)==1)
    {
        System.out.println("No is odd");
    }
    else
    {
        System.out.println("No is even");
    }
    }
    public static void main(String[] args) {
        evenOdd(0);
        evenOdd(1);
        evenOdd(2);
    }
}
