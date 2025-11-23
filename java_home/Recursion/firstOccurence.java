package Recursion;

public class firstOccurence {
    // check count
    // is count >= 1 then again check that element again and return at first occurence 
    public static int firstOcr(int arr[], int idx, int target) {
        if (idx == arr.length - 1) {
            System.out.println("Key not Found");
            return -1;
        } else if (arr[idx] == target) {
            System.out.println("Key Found at idx " + idx);
            return idx;
        }
        return firstOcr(arr, idx + 1, target);
    }

    public static void main(String[] args) {
        int arr[]={8,3,6,9,5,10,2,5,3};
        firstOcr(arr, 0, 1);
    }
}
