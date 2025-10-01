import java.util.Scanner;
public class linBinSerMax {
    public static int findMax(int[] num) {
        int max = 0;
        for(int i = 1 ; i < num.length ; i++) {
            if(num[i]>max) {
                max = num [i];
            }
        }
        return max;
    }
    public static int lSer(int num[]) {
            Scanner sc = new Scanner (System.in);
        System.out.print("Enter your Key : ");
    int key = sc.nextInt();
    for(int i = 0 ; i < num.length ; i++ ) {
        if(key == num[i]) {
            return i;
        }
    }
    return -1;    
    }
    public static int binSer(int[] num) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter your Key : ");
    int key = sc.nextInt();
        int start = 0 , end = num.length-1;
        int mid = (start + end)/2;
        while(start < end){
        if(key == num[mid]) {
            System.out.println("Element " + key +" found at index : " + mid);
            return 1;
        }
        else if(key < num[mid]) {
            end = mid - 1 ;
            mid = (start + end)/2;
        }
        else if(key > num[mid]) {
            start = mid + 1;
            mid = (start + end)/2;
        }
    }
    return 0;
    }
    public static void main(String[] args) {
      Scanner sc = new Scanner (System.in);
      System.out.print("Enter length of list : ");
      int len = sc.nextInt();
      System.out.println("Enter " + len +" numbers : ");
      int arr[] = new int[len];
      for( int i = 0 ; i < arr.length ; i++) {
          arr[i] = sc.nextInt();
      }
      int result = lSer (arr);
      if(result==-1) {
          System.out.println("Element not found !!!");
      }
      else {
          System.out.println("Element " + arr[result] + " found at index " + result );
      }
      
      int max = findMax(arr);
      System.out.println("maximum in the list is : " + max);
      int rtn = binSer(arr);
      if(rtn==0)
      System.out.print("Element not found !!!");
  }
}