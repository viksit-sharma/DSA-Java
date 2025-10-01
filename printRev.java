//PROGRAM TO PRINT REVERSE OF ANY NUMBER
import java.util.Scanner;
public class printRev{
    public static void main(String[] args) {
        System.out.print("Enter a Number : ");
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        System.out.print("Reversed Number is : ");
        for(;n>0;n=n/10) {
            System.out.print(n%10);
        }

    }
}