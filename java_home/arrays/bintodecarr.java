package arrays;
import java.util.Scanner;
public class bintodecarr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a decimal number : ");
        int dec = sc.nextInt();
        int bin[] = new int[100];
        
        int count = 0;
        int deci = dec;
        for(int temp = 0 ; dec > 0 ; temp++)
        {
            bin[temp] = dec % 2;
            dec = dec / 2;
            count++;
        }
        System.out.print("The binary of " + deci + " is : ");
        for(int temp = count - 1 ; temp >= 0 ; temp--)
        {
            System.out.print(bin[temp]);
        }
    }
}





