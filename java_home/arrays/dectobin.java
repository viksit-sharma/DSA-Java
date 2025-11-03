package java_home.arrays;
import java.util.Scanner;
public class dectobin {
    public static void dectobin(int dec) {
        int deci = dec;
        int lastdig;
        int bin = 0;
        int pow = 0;
        while(dec>0)
        {
            lastdig = dec % 2;
            bin = bin + (lastdig * (int)Math.pow(10,pow));
            dec/=2;
            pow++;
        }
        System.out.println(bin);
        System.out.println("The Binary of " + deci + " is : " + bin);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a decimal number : ");
        int dec = sc.nextInt();
        dectobin(dec);
    }
}