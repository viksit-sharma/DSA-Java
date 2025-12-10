import divideAndConquer.quickSort;

public class sample1 {
    public static void quickSort(int arr[], int si, int ei) {
        if (si >= ei) {
            return;
        }

        // int pvtIdx = 0;
        // int j = si;
        // int i = si - 1;
        // int pvt = arr[ei];
        // while (j < ei) {
        //     if (arr[j] < pvt) {
        //         i++;
        //         int temp = arr[j];
        //         arr[j] = arr[i];
        //         arr[i] = temp;
        //     }
        //     j++;
        // }
        // i++;
        // int temp = arr[j];
        // arr[j] = arr[i];
        // arr[i] = temp;
        // pvtIdx = i;
        int pvtIdx = pivot(arr, si, ei);
        quickSort(arr, si, pvtIdx - 1);
        quickSort(arr, pvtIdx + 1, ei);
    }
    public static int pivot(int arr[], int si, int ei) {
        int pvtIdx = 0;
        int j = si;
        int i = si - 1;
        int pvt = arr[ei];
        while (j < ei) {
            if (arr[j] < pvt) {
                i++;
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
            j++;
        }
        i++;
        int temp = arr[j];
        arr[j] = arr[i];
        arr[i] = temp;
        pvtIdx = i;
        return pvtIdx;
    }
    public static void main(String[] args) {
        int arr[] = { 1, 3, 5, 4, 8, 2 };
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        quickSort(arr, 0, 5);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
