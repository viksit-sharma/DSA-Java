package divideAndConquer;

public class mergeSort {
    public static void mergeSorter(int[] arr, int si, int ei) {
        if (si == ei) {
            return;
        }
        int mid = si + (ei - si) / 2;
        mergeSorter(arr, si, mid);
        mergeSorter(arr, mid + 1, ei);
        merge(arr, si, mid, ei);
    }

    public static void merge(int[] arr, int si, int mid, int ei) {
        int i = si;
        int j = mid + 1;
        int k = 0;
        int[] temp = new int[ei - si + 1];
        while (i <= mid && j <= ei)
        {
            if (arr[i] < arr[j]) {
            temp[k] = arr[i];
            i++;
            } else {
                temp[k] = arr[j];
                j++;
            }
            k++;
        }
        while (i <= mid) {
            temp[k++] = arr[i++];
        }
        while (j <= ei) {
            temp[k++] = arr[j++];
        }
        for (int l = 0, m = si; l < temp.length; m++, l++) {
            arr[m] = temp[l];
        }
    }
    public static void main(String[] args) {
        int arr[] = { 6, 3, 9, 5, 2, 8 };
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        mergeSorter(arr, 0, arr.length - 1);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
