import java.util.*;
//FOR CONSECUTIVE SUBARRAYS WITH SUM EQUALS TO 0
public class arrayAssi5 {
    public static void main(String[] args) {
        //arr[]={-1,1,0,-1,2,3,-5}
        Scanner sc= new Scanner(System.in);
         System.out.print("Enter size of array : ");
        int size = sc.nextInt();
        int arr[]=new int[size];
        int len = arr.length;
        for (int i = 0; i < len; i++) {
            arr[i] = sc.nextInt();
        }
    
        int currSum = 0;
        int end = len-2>0?len-2:1;
        if (end > 2) {
            for (int i = 0; i < end; i++) {

                currSum = arr[i] + arr[i + 1] + arr[i + 2];
                if (currSum == 0) {
                    System.out.print("[");
                    for (int j = i; j < i + 3; j++) {
                        System.out.print(arr[j]);
                        if (j > -1 && j < i + 2)
                            System.out.print(",");
                    }
                    System.out.print("]");
                }
            }
        }
        else {
                System.out.print("[");
                    System.out.print("]");
                }
    }
}
