import java.util.*;

public class findEleIn2Darray {
    public static void search(int numbers[][],int target,int rows,int columns){
        for (int i = 0; i < rows; i++) {
                    for (int j = 0; j < columns; j++) {
                        if (target == numbers[i][j]) {
                            System.out.println("Element " + numbers[i][j] + " found at row : " + i + " and column : " + j);
                        }
                    }
                }
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
        System.out.print("Enter target element : ");
        int target = sc.nextInt();
        search(numbers, target, rows, columns);
        sc.close();
        
        //OUTPUT
        // for (int i = 0; i < rows; i++) {
        //     System.out.print("Row ["+i + "] : ");
        //     for (int j = 0; j < columns; j++) {
        //         System.out.print(numbers[i][j] + " ");
        //     }
        //     System.out.println();
        // }
    }
}
