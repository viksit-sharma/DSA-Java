package arrays;
import java.util.Scanner;
public class rainWater {
    public static void trappedWater(int[] arr) {
        int rMax[] = new int[arr.length];//Created auxillary array to store maximum wall value of right side of that index
        int lMax[] = new int[arr.length];//created auxillay array to store maximum wall value of left side of that index
        rMax[0] = arr[0];
        lMax[arr.length-1] = arr[arr.length-1];
        for (int i = 1; i < arr.length; i++) {
            if (rMax[i-1] < arr[i]) {//if right maximum wall value is lesser than current index arr then assign the current array value to maximum wall value
                rMax[i] = arr[i];
            } else {//otherwise assign previous maximum wall value to current maximum wall value
                rMax[i] = rMax[i - 1];
            }
        }
        // for (int i = 0; i < arr.length; i++) {
        //     System.out.print(rMax[i]);
        // }
        // System.out.println();
        for (int i = arr.length - 2; i >= 0; i--) {
            if (lMax[i+1] < arr[i]) {//if left maximum wall value is lesser than current index arr then assign the current array value to maximum wall value
                lMax[i] = arr[i];
            } else {//otherwise assign previous maximum wall value to current maximum wall value
                lMax[i] = lMax[i + 1];
            }
        }
        // for (int i = 0; i < arr.length; i++) {
        //     System.out.print(lMax[i]);
        // }
        int trapWater = 0;
        for (int i = 0; i < arr.length; i++) {
            int min = Math.min(rMax[i], lMax[i]);
            trapWater = trapWater + min - arr[i];//minimum wall wale mein se height of current bar ko minus karo aur trapped water ko jod do
        }
        System.out.println("The total trapped water is : "+trapWater);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array : ");
        int size = sc.nextInt();

        int arr[]= new int[size];
        System.out.println("Enter "+ size + " elements : ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        trappedWater(arr);
    }
}
