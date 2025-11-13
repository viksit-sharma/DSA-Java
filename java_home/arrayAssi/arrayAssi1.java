import java.util.*;
public class arrayAssi1 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
         System.out.print("Enter size of array : ");
         int size = sc.nextInt();
        sc.close();
        int arr[]=new int[size];
        
        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        boolean flag = false;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    flag = true;
                }
            }
        }
        System.out.println(flag);
    }
}
