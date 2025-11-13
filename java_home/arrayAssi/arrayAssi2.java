import java.util.*;

public class arrayAssi2 {

    // public static int check(int[] arr,int target) {----//TIME COMPLEXITY = O(n)----
    //     for (int i = 0; i < arr.length; i++) {
    //         if (target == arr[i]) {
    //             return i;
    //         }
    //     }
    //     return -1;
    // }

    public static int check(int[] arr, int target) {//----TIME COMPLEXITY = O(log(n))----
        //arr[]={4,5,6,7,0,1,2}target=0
        int low = 0;
        int high = arr.length - 1;//high=6

        while (low <= high) {// 1) 0<=6(true)// 7) 4<=6(true)// 13) 4<=4(true)
            int mid = low + (high - low) / 2;// 2) mid=3// 8) mid=5// 14) mid=4
            if (arr[mid] == target) {// 3) 7==0(false)// 9) 1==0(false)// 15) 0==0(true)
                return mid;
            } else if (arr[low] <= arr[mid]) {// 4) 4<=7(true)// 10) 0<=1(true)
                if (arr[mid] > target && arr[low] <= target) {//5) 7>0 && 4<=0(false)// 11) 1>0 && 0<=0(true)
                    high = mid - 1;// 12) high=4
                } else {
                    low = mid + 1;// 6) low=4
                }
            } else {
                if (arr[mid] < target && arr[high] >= target) {
                    low = mid + 1;
                } else {
                    high = mid - 1;
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array : ");
        int size = sc.nextInt();

        int arr[] = new int[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter the target : ");
        int target = sc.nextInt();
        sc.close();
        System.out.println(check(arr, target));
    }
}
