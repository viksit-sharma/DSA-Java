//PROGRAM TO PRINT STORE REVERSE NUMBER
import java.util.Scanner;
public class storeRev {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a Number : ");
        int n = scan.nextInt();
        int rev=0;
        int lastdig;
        while(n>0) {
            lastdig=n%10;
            rev=lastdig+rev*10;
            n=n/10;
        }
        System.out.print("Reversed Number is : ");
        System.out.println(rev);
    }
}