package sorting;

public class insertionSort2 {
    public static void printArr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.err.println();
    }
    public static void main(String[] args) {
        int arr[] = { 5, 3, 4, 1, 2 };
        printArr(arr);

        for(int i=1;i<arr.length;i++){
            int cp=arr[i];
            int j = i-1;
            while(j >= 0 && cp < arr[j] ){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1]=cp;
        }
        printArr(arr);
    }
}
