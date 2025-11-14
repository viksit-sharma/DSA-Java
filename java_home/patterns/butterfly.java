package patterns;
import java.util.Scanner;
public class butterfly {
    public static void main(String[] args) {
        System.out.print("Enter a Number : ");
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        for(int line = 1 ; line <= num - 1 ; line++) {
            for(int star = 1 ; star <= line ; star++) {
                System.out.print("* ");
            }
            for(int space = num-line - 1 ; space > 0 ; space--) {
                System.out.print("  ");
            }
            for(int space = num-line - 1 ; space > 0 ; space--) {
                System.out.print("  "); 
            }
            for(int star = 1 ; star <= line ; star++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for(int line = 1 ; line <= num - 1 ; line++) {
            for(int star = num - line ; star > 0 ; star--) {
                System.out.print("* ");
            }
            for(int space = 1 ; space < line ; space++) {
                System.out.print("  ");
            }
            for(int space = 1 ; space < line ; space++) {
                System.out.print("  ");
            }
            for(int star  = num - line ; star > 0 ; star--) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}


