import java.util.Scanner; 

public class digsum {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number : ");
        int num = sc.nextInt();

        int digSum = 0;

        int numb = num ;

        while(numb>0) {

            int lastdig = numb % 10;
            digSum = digSum + lastdig;
            numb/=10;

        }
        
        System.out.print("The sum of digit of "+ num + " is : "+ digSum);
    }
}
