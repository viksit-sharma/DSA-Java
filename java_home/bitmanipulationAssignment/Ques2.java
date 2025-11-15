package bitmanipulationAssignment;
//Question 2 : Swap two numbers without using any third variable.
public class Ques2 {
    public static int[] swap(int a, int b) {
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;
        return new int[] { a, b };
    }

    public static void main(String[] args) {
        
        int arr1[] = new int[] { 10, 20 };

        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i] + " ");
        }

        System.out.println();

        int arr[] = swap(arr1[0], arr1[1]);
        
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
