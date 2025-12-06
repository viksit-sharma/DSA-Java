package divideAndConquer;

public class rotArrBinSer {
    public static int modBinSer(int[] arr, int target, int si, int ei) {
        //base case
        if (si > ei) {
            return -1;
        }
        int mid = si + (ei - si) / 2;
        //kaam
        if (arr[mid] == target) {//target found
            return mid;
        }
        else if (arr[si] <= arr[mid]) {//true then line 1 pe hai apan
            if (target <= arr[mid] && target >= arr[si]) {//true then target lies on left of mid ie in line 1
                return modBinSer(arr, target, si, mid - 1);
            } else {//true then target lies on right side of mid ie in line 1
                return modBinSer(arr, target, mid + 1, ei);
            }
        }
        else {//true then line 2 pe hai apan
            if (target >= arr[mid] && target <= arr[ei]) {//true then target lies on right of mid ie in line 2
                return modBinSer(arr, target, mid + 1, ei);
            }
            else {//true then target lies on rleft side of mid ie in line 2
                return modBinSer(arr, target, si, mid - 1);
            }
        }
    }
}
