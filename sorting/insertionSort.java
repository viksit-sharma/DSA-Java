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

    public static void insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int cP = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > cP) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j+1] = cP;
        }
    }

    public static void main(String[] args) {
        int arr[] = Scanner();
        printArr(arr);
        insertionSort(arr);
        printArr(arr);
    }
}
