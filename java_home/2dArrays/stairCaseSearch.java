import java.util.Scanner;

public class stairCaseSearch {
    public static int[] stairCaseSer(int[][] matrix, int target) {
        int j = 0,i = matrix.length-1;
        while (i >= 0 && j >= 0 && i < matrix.length && j < matrix.length) {
            if (target == matrix[i][j]) {
                return new int[] {matrix[i][j],i,j};
            } else if (target < matrix[i][j]) {
                i--;
            } else if (target > matrix[i][j]) {
                j++;
            }
        }
        return new int[]{0};
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
        System.out.print("Enter target : ");
        int target = sc.nextInt();
        sc.close();
        int res[] = stairCaseSer(matrix, target);
        if (res[0] != 0) {
            System.out.print("Element (" + res[0] + ") found at index [" + res[1] + "][" + res[2] + "]");
        }
        else {
            System.out.println("Element not found !!!");
        }
    }
}
