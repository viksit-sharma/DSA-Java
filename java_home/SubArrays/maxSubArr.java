package SubArrays;
import java.util.Scanner;
public class maxSubArr {
    public static void maxSubArr(int[] arr) {
        int currSum, maxSum = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j <= arr.length; j++) {
                currSum = 0;
                for (int k = i; k < j; k++) {
                    currSum += arr[k];
                }
                if (currSum > maxSum) {
                    maxSum = currSum;
                }
            }
        }
        System.out.println("Max sum Subarray is : "+ maxSum);
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
        maxSubArr(arr);
    }
}
