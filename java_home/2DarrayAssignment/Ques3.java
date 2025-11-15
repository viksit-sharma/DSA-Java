// Question 3 : Write a program to Find Transpose of a Matrix.
// What is Transpose?
// Transpose of a matrix is the process of swapping the rows to columns. For a 2x3 matrix,
// Matrix
// a11 a12 a13
// a21 a22 a23
// Transposed Matrix
// a11 a21
// a12 a22
// a13 a23
public class Ques3 {
    public static int[][] transpose(int arr[][]) {
        int rows = arr.length;
        int cols = arr[0].length;
        int trans[][] = new int[cols][rows];
        for (int i = 0; i < trans.length; i++) {
            for (int j = 0; j < trans[0].length; j++) {
                trans[i][j] = arr[j][i];
            }
        }
        return trans;
    }

    public static void main(String[] args) {
        int arr[][] = { { 11, 12, 13, 14 }, { 21, 22, 23, 24 } };

        System.out.println("Before transpose : ");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        
        int trans[][] = transpose(arr);
        System.out.println("After transpose : ");
        for (int i = 0; i < trans.length;i++) {
            for (int j = 0; j < trans[0].length; j++) {
                System.out.print(trans[i][j] + " ");
            }
            System.out.println();
        }
    }
}
