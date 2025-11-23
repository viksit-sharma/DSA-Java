package Recursion;

public class ArraySorted {
    public static void isSorted(int arr[],int idx) {
        if (idx == arr.length-1) {
            System.out.println("Array is sorted");
            return;
        }
        else if (arr[idx] > arr[idx + 1]) {
            System.out.println("Array is not sorted");
            return;
        }
        else {
            isSorted(arr,idx+1);
        }
    }

    public static void main(String[] args) {
        int arr[]={1,2,3,6,5};
        isSorted(arr, 0);
    }
}
