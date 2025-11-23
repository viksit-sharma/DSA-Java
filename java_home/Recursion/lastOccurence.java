package Recursion;

public class lastOccurence {
    public static int lastOcr(int arr[], int idx, int target) {
        if (idx == arr.length - 1) {
            return -1;
        }
        else if (target == arr[arr.length - 1 - idx])
        {
            return arr.length - 1 - idx;
        }
        else {
            return lastOcr(arr, idx+1, target);
        }
    }
    public static int lastOcrS(int arr[], int idx, int target) {
        if (idx == arr.length) {
            return -1;
        }
        int isFound = lastOcrS(arr, idx + 1, target);
        if (isFound == -1 && target == arr[idx])
        {
            return idx;
        }
        else {
            return isFound;
        }
    }

    public static void main(String[] args) {
        int arr[] = { 8, 3, 6, 9, 5, 5, 5, 5, 3 };
        System.out.println("Element "+5+" occured last time at index "+lastOcrS(arr, 0, 5));
    }
}
