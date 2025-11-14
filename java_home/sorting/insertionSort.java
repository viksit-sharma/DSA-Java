package sorting;
import java.util.Scanner;

public class insertionSort {
    public static void printArr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.err.println();
    }

    public static int[] Scanner() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array : ");
        int size = sc.nextInt();

        int arr[] = new int[size];
        System.out.println("Enter " + size + " elements : ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        return arr;
    }

    public static void insertionSort(int[] arr) {//5,3,4,1,2
        for (int i = 1; i < arr.length; i++) {
            int cP = arr[i];//3//4
            int j = i - 1;//0//1
            while (j >= 0 && arr[j] > cP) {//1>=0 && 5>4
                arr[j + 1] = arr[j];//5->3//5->4
                j--;//-1//0
            }
            arr[j+1] = cP;//3,4,5
        }
    }

    public static void main(String[] args) {
        int arr[] = Scanner();
        printArr(arr);
        insertionSort(arr);
        printArr(arr);
    }
}
