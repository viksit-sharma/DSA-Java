package patterns;
import java.util.Scanner;
public class invTri {

    public static void llt(int num) {
        for(int line = 1 ; line <= num ; line++)
            {
                for(int space = num - line ; space > 0 ; space--)
                {
                    System.out.print(" ");
                }
                for(int star = 1 ; star <= line ; star++)
                {
                    System.out.print("*");
                }
                System.out.println();
            }
            System.out.println();
    }
    public static void ihp(int num) {
        for(int line = 0 ; line < num ; line ++)
            {
                int Int = 1;
                for(int star = num - line ; star > 0 ; star--)
                {
                    
                    System.out.print(Int);
                    Int++;
                }
                System.out.println();
            }
            System.out.println();
    }
    public static void floyd(int num) {
        int Int = 1;
            for(int line = 1 ; line <= num ; line++)
            {
                for(int Num = 1 ; Num <= line ; Num++)
                {
                    System.out.print(Int + " ");
                    Int++;
                }
                System.out.println();
            }
            System.out.println();
    }
    static void zero_one(int num) {
        int Int = 0;
            for(int line = 1 ; line <= num ; line++)
            {
                if(line % 2 == 0)
                {
                    Int = 0;
                }
                else if(line % 2 != 0)
                {
                    Int = 1;
                }
                for(int Num = 1 ; Num <= line ; Num++)
                {
                    System.out.print(Int + " ");
                    if(Int == 0)
                    {                                            
                        Int = 1;
                    }
                    else if(Int == 1)         
                    {
                        Int = 0;
                    }
                }
                System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number : ");
        int num = sc.nextInt();

        System.out.print("Enter your choice : ");
        int choice = sc.nextInt();

        switch(choice)
        {
            case 1 : llt(num);break;
            case 2 : ihp(num);break;
            case 3 : floyd(num);break;
            case 4 : zero_one(num);break;
            case 5 : break;
        }
        
    }
}