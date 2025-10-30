package arrays;
//PROGRAM TO SWAP TWO NUMBERS 
import java.util.Scanner;
public class swapTwoNum {
    public static void swap(int x, int y) {
        int temp = x;
        x = y;
        y = temp;
        System.out.println("The number after swapping are : ");

        System.out.println("number 1 is : "+x);
        System.out.println("number 2 is : "+y);
    }
    public static int mul(int x, int y) {
        return x*y;
    }
    public static int fact(int x){
        int fac1=1;
        for(int i=1 ; i <= x ; i++)
        {
            fac1 = i * fac1;
        }
        return fac1;
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner (System.in);

        System.out.print("Enter two Numbers : ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        System.out.println("The number before swapping are : ");
        System.out.println("number 1 is : "+num1);
        System.out.println("number 2 is : "+num2);
        swap(num1,num2);

        System.out.println("The result is : " + mul(num1,num2));

        System.out.print("Factorial of " + num1 + " is : " + fact(num1));
    }
}