package java_home.sorting;

public class countingSort2 {
    public static void printArr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.err.println();
    }
    public static void main(String[] args) {
        int arr[] = { 1,0,0, 4, 1, 3, 2, 4, 3, 7 };
        printArr(arr);
        int freq[] = new int[arr.length];
        int max=Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            freq[arr[i]]++;
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        int j = 0;
        for (int i = 0; i <= max; i++) {
            while (freq[i] > 0) {//0,2,1,2,2,0,0,1
                arr[j] = i;
                j++;
                freq[i]--;
            }
        }
        printArr(arr);
    }
}
