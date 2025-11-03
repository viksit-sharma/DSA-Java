package java_home.arrays;
import java.util.Scanner;
public class divBy10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        do{
            System.out.print("Enter a number : ");
            int num = sc.nextInt();
            if(num%10==0)
            {
                break;
            } else {
                System.out.println(num);
            }
        }while(true);
    }
}