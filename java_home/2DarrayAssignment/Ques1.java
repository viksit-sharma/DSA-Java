//Question 1 : Print the number of 7’s that are in the 2d array.
// Example :
// Input - int[][] array = { {4,7,8},{8,8,7} };
// Output - 2
public class Ques1 {
    public static int counter(int arr[][], int num) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if (arr[i][j] == num) {
                    count++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        //IN A TWO DIEMENTIONAL ARRAY
        // int arr[2][3] = { { 1, 2, 3 }, { 4, 5, 6 } };
        //GIVES NUMBER OF ROWS
        // arr.length
        //GIVES NUMBER OF COOLUMNS
        // arr[0].length
        int[][] array = { {4,7,8},{8,8,7} };
        int count = counter(array, 8);
        System.out.println(count);
    }
}
