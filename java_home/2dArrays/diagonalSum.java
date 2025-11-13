import java.util.Scanner;

public class diagonalSum {
    public static int[] diaSumB(int matrix[][]) {
        int diaSum1 = 0;
        int diaSum2 = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                if (i == j) {
                    diaSum1 += matrix[i][j];
                } else if (i + j == matrix.length - 1) {
                    diaSum2 += matrix[i][j];
                }
            }
        }
        return new int[] { diaSum1, diaSum2, diaSum1 + diaSum2 };
    }
    public static int[] diaSumO(int matrix[][]) {
        int diaSum1 = 0;
        int diaSum2 = 0;
        for (int i = 0; i < matrix.length; i++) {
            diaSum1 += matrix[i][i];
            if(i!= matrix.length-1-i)
            {
                diaSum2 += matrix[i][matrix.length-1-i];
            }
        }
        return new int[] { diaSum1, diaSum2, diaSum1 + diaSum2 };
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int rows = sc.nextInt();
        int columns = sc.nextInt();

        int[][] matrix = new int[rows][columns];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        sc.close();
        int arr[] = diaSumO(matrix);
        System.out.println("Primary diagonal sum is : "+arr[0]+"\nSecondary diagonal sum is : "+arr[1]+"\nTotal diagonal sum is : "+arr[2]);
    }
}
