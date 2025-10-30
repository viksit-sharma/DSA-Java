package SubArrays;
import java.util.Scanner;

public class maxSubArrPrefix {
    public static void maxSubArrPrefix(int[] arr) {
        int prefix[] = new int[arr.length];
        prefix[0] = arr[0];
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;
        for (int i = 1; i < arr.length; i++) {
            prefix[i] = prefix[i - 1] + arr[i];
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                currSum = i == 0 ? prefix[j] : prefix[j] - prefix[i - 1];
                // System.out.print(currSum+" ");
                if (currSum > maxSum) {
                    maxSum = currSum;
                }
            }
        }
        System.out.println("The max subarray sum is : "+ maxSum);
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
        maxSubArrPrefix(arr);
    }
}
