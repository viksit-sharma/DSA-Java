package RecursionAssignment;
/** 
 * Question1:For a given integer array of size N.You have to find all the occurrences(indices) of a given element(Key) and print them.Use a recursive function to solve this problem.
 * Sample Input: arr[ ] = {3, 2, 4, 5, 6, 4, 7, 4, 2},key = 2 
 * Sample Output: 1 5 7 8
 * */
public class Ques1 {
    public static void print(int[] arr, int idx, int key) {
        if (idx == arr.length) {
            return;
        } else {
            if (arr[idx] == key) {
                System.out.println(idx + " ");
                print(arr, idx + 1, key);
            } else {
                print(arr, idx + 1, key);
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = {3, 2, 4, 5, 4, 2, 7, 4, 2};
        int key = 4 ;
        print(arr, 0, key);
    }
}
