package SubArrays;
import java.util.Scanner;
public class printSubArrBrute {
    public static void printSubArr(int arr[]) {
        int ts = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j <= arr.length; j++) {
                System.out.print("(");
                for (int k = i; k < j; k++) {
                    if(k!=i)
                    System.out.print(",");
                    System.out.print(arr[k]);
                }
                ts++;
                System.out.print(") ");
            }
            System.out.println();
        }
        System.out.println("The total subarrays are : " + ts);
        int n=arr.length;
        System.out.println("The total subarrays are : " + (n * (n + 1)) / 2);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array : ");
        int size = sc.nextInt();

        int arr[]= new int[size];
        System.out.println("Enter "+ size + " elements : ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();
        printSubArr(arr);
    }
}
