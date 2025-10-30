package SubArrays;
public class maxSubArrSlide {//only valid if we take fix subarray like here is 3 and not for all possible subarrays
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5 };
        int winSum = 0;
        int k=3;
        for (int i = 0; i < k; i++) {
            winSum += arr[i];
        }
        int maxSum = winSum;
        for (int j = k; j < arr.length; j++) {
            winSum = winSum + arr[j] - arr[j - k];
            if (winSum > maxSum) {
                maxSum = winSum;
            }
        }
        System.out.print("Maximum sum of subarray is " + maxSum);
    }
}
