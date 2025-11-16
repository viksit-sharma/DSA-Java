import java.util.Scanner;

public class spiralMatrix {
    public static void spiral(int matrix[][]) {
        int startRow, startCol, endRow, endCol;
        startRow = startCol = 0;
        endRow = matrix.length - 1;
        endCol = matrix[0].length-1;
        while (startRow <= endRow && startCol <= endCol) {
            for (int i = startCol; i <= endCol; i++) {
                System.out.println(matrix[startRow][i]);
            }
            for (int i = startRow + 1; i <= endRow; i++) {
                System.out.println(matrix[i][endCol]);
            }
            for (int i = endCol - 1; i >= startCol; i--) {
                System.out.println(matrix[endRow][i]);
            }
            for (int i = endRow - 1; i >= startRow + 1; i--) {
                System.out.println(matrix[i][startCol]);
            }
            startRow++;
            startCol++;
            endRow--;
            endCol--;
        }
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
            spiral(matrix);
    }
}
