package arrays;
import java.util.Scanner;
public class bintodec {

    public static void bintodec(int bin) {
        int binary=bin;
        int dec = 0;
        int pr = 0;
        while(bin>0) {
            int lastdig = bin % 10;
            
            dec = dec + lastdig*(int)Math.pow(2,pr);
            pr++;
            bin = bin / 10;
        }
        System.out.println("The decimal of "+binary+" is : "+dec);
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a binary number : ");
        int bin = sc.nextInt();
        bintodec(bin);
    }
}