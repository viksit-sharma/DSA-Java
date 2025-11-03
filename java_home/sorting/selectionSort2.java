package java_home.sorting;

public class selectionSort2 {
    public static void print(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[] = { 5, 3, 4, 1, 2 };

        print(arr);
        
        for (int i = 0; i < arr.length; i++) {//5,3,4,1,2
            int min = Integer.MAX_VALUE;
            int index = 0;
            for (int j = i; j < arr.length; j++) {
                if (arr[j] < min) {
                    min = arr[j];//1

                    index = j;//3
                }
                System.out.println("minimum is " + min + " arr[" + j + "] is " + arr[j]);
            }
            for (int k = index; k > i; k--) {
                arr[k] = arr[k - 1];
            }
            //1,5,5,5,5
            arr[i] = min;//1,2,5,5,5
        }
        print(arr);
    }
}
