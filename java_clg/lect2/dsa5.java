import java.util.Scanner;
public class dsa5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter integer : ");
        int a = sc.nextInt();
        System.out.print("Enter float : ");
        float b = sc.nextFloat();
        System.out.print("Enter Double : ");
        double c = sc.nextDouble();
        System.out.print("Enter Word : ");
        String e = sc.next();
        sc.nextLine();
        System.out.print("Enter String : ");
        String d = sc.nextLine();

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);

        sc.close();
    }
}