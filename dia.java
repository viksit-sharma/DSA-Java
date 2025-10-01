import java.util.Scanner;
public class dia {
    public static void main(String[] args) {
        System.out.print("Enter a Number : ");
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        for(int line = 1 ; line <= num ; line++) {
            for(int space = num - line ; space > 0 ; space--) {
                System.out.print(" ");
            }
            for(int star = 1 ; star <= 2*line - 1 ; star ++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for(int line = 1 ; line <= num ; line++) {
            for(int space = 1 ; space <= line ; space++) {
                System.out.print(" ");
            }
            for(int star = 2*(num - line) - 1 ; star > 0 ; star--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}



