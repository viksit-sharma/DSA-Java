import java.util.Scanner;

public class countingSort {
    public static void countingSort(int[] arr) {
        int largest = Integer.MIN_VALUE; 
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > largest) {
                largest = arr[i];
            }
        }
        int count[] = new int[largest +1];
        System.out.println(largest);
        for (int i = 0; i < largest + 1; i++) {
            count[i] = 0;
            for (int j = 0; j < arr.length; j++) {
                if (arr[j] == i) {
                    count[i]++;
                }
            }
            // count[arr[i]]++;
        }
        int j = 0;
        for (int i = 0; i < largest + 1; i++) {
            while (count[i] > 0) {
                arr[j] = i;
                j++;
                count[i]--;
            }
        }
    }
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
    public static void main(String[] args) {
        int arr[] = Scanner();
        printArr(arr);
        countingSort(arr);
        printArr(arr);      
    }
}
