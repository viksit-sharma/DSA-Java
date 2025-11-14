package patterns;
//TO PRINT RIGHT LOWER TRIANGLE
import java.util.Scanner;
public class printLowerTri {

    public static void printlrt(int num)
    {
        for(int line = 1 ; line <= num ; line++)
        {
            for(int star = 1 ; star <= line ; star++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void printurt(int num)
    {
        for(int line = num ; line > 0 ; line--)
        {
            for(int star = 1 ; star <= line ; star++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void printdig(int num)
    {
        for(int line = 1 ; line <= num ; line++)
        {
            for(int dig = 1 ; dig <= line ; dig++)
            {
                System.out.print(dig);
            }
            System.out.println();
        }
    }
    public static void printalp(int num)
    {
        int alp = 65;
        for(int line = 1 ; line <= num ; line ++)
        {
            for(int ch = 1 ; ch <= line ; ch++)
            {
                System.out.print((char) alp);
                alp++;
            }
            System.out.println();
        }
    }
    public static void printalpb(int num)
    {
        char alpb = 'A';
        for(int line = 1 ; line <= num ; line ++)
        {
            for(int ch = 1 ; ch <= line ; ch++)
            {
                System.out.print(alpb);
                alpb++;
            }
            System.out.println();
        }
    }
    public static void printpalindig(int num)
    {
        for(int line = 1 ; line <= num ; line++)
        {

            int fl = line;
            for(int spc = num - line ; spc > 0 ; spc--)
            {
                System.out.print(" ");
            }
            for(int n1 = 1 ; n1 <= line ; n1++)
            {
                System.out.print(fl);
                fl--;
            }
            for(int n2 = 2 ; n2 <= line ; n2++)
            {
                System.out.print(n2);
            }
            System.out.println();
        }
    }
    public static void printeventri(int num)
    {
        for(int line = 1 ; line <= num ; line++) {

//            int fl = line;
            for (int spc = num - line; spc > 0; spc--) {
                System.out.print(" ");
            }
            for (int n1 = 1; n1 <= line; n1++) {
                System.out.print(line + " ");
//                fl--;
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number : ");
        int num = sc.nextInt();

        do{
            System.out.println("\n----MENU BAR ----\n Enter 1 to print palindromic digit triangle\n Enter 2 or 3 to print albhabetic triangle\n Enter 4 to print digit triangle\n Enter 5 to print lower right triangle\n Enter 6 to print upper right triangle\n Enter 7 to print even digit triangle\n Enter 8 to exit\n");
            int choice = sc.nextInt();
            System.out.println();

            if (choice == 1)
                printpalindig(num);
            else if (choice == 2)
                printalp(num);
            else if (choice == 3)
                printalpb(num);
            else if (choice == 4)
                printdig(num);
            else if (choice == 5)
                printlrt(num);
            else if (choice == 6)
                printurt(num);
            else if (choice == 7)
                printeventri(num);
            else if (choice== 8)
                break;
        }while(true);
    }
}