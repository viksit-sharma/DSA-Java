package SubArrays;
import java.util.Scanner;

public class maxSubArrKadane {
    public static void maxSubArrKadane(int arr[]) {
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            currSum += arr[i];
            if (currSum < 0) {
                currSum = 0;
            }
            maxSum = Math.max(maxSum, currSum);
        }
        System.out.print("Maximum subarray sum is : " + maxSum);
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
        maxSubArrKadane(arr);
    }
}
