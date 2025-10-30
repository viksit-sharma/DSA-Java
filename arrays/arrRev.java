package arrays;
import java.util.Scanner;
public class arrRev {
    public static void arrRev(int arr[]) {

        for(int i = 1; i <= (arr.length)/2; i++) {
            int temp = arr[i-1];
            arr[i-1] = arr[arr.length - i];
            arr[arr.length - i] = temp;
        }
        
        System.out.println();

        System.out.print("Array after Reversing : ");
        for(int i = 0; i<arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array : ");
        int size = sc.nextInt();

        int arr[]= new int[size];
        System.out.println("Enter "+ size + " elements : ");
        for(int i = 0 ; i < arr.length ; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Array before Reversing : ");
        for(int i = 0; i<arr.length; i++) {
            System.out.print(arr[i]+" ");
        }

        arrRev(arr);
    }
}