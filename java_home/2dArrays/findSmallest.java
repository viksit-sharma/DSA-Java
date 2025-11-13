import java.util.Scanner;

public class findSmallest {
    public static int findSm(int arr[][], int rows, int cols) {
        int smallest = Integer.MAX_VALUE;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (arr[i][j] < smallest) {
                    smallest = arr[i][j];
                }
            }
        }
        return smallest;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int rows = sc.nextInt();
        int columns = sc.nextInt();

        int[][] numbers = new int[rows][columns];
        
        // INPUT
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                numbers[i][j] = sc.nextInt();
            }
        }
        sc.close();
        int smallest = findSm(numbers, rows, columns);
        System.out.println("Smallest in given array is : "+smallest);

    }
}
