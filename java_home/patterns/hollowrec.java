package java_home.patterns;
import java.util.Scanner;
public class hollowrec {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = sc.nextInt();
        for(int line = 1 ; line < num ; line++)
        {
            for(int star = 1 ; star<num+1 ; star++)
            { 
                if(line==1||line==num-1)
                {
                    System.out.print("*");
                }
                else if(line>1&&line<num-1&&star==1||star==num)
                {
                    System.out.print("*");
                }
                else System.out.print(" ");
            }
            System.out.println();
        }
    }
}

