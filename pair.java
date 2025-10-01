import java.util.Scanner;
public class pair {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter size of array : ");

        int size = sc.nextInt();

        int arr[] = new int[size];

        System.out.println("Enter the elements : ");

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        int tp = 0;
        System.out.println("The pairs of given array are : ");

        for (int i = 0; i < arr.length; i++) {

            for (int j = i + 1; j < arr.length; j++) {

                System.out.print("(" + arr[i] + "," + arr[j] + ") ");
                tp++;

            }
            System.out.println();
        }
        System.out.println("Total no. of pairs in array are : " + tp);
        System.out.println("Total no. of pairs in array are : " + (size * (size - 1)) / 2);
    }
}
