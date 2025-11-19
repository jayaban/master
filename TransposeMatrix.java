package Java;
import java.util.Arrays;
import java.util.Scanner;

public class TransposeMatrix {

    public int[][] transpose(int[][] matrix) {
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return new int[0][0];
        }
        int[][] result = new int[matrix[0].length][matrix.length];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                result[j][i] = matrix[i][j];
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TransposeMatrix tm = new TransposeMatrix();

        System.out.print("Enter rows: ");
        int rows = sc.nextInt();
        System.out.print("Enter columns: ");
        int cols = sc.nextInt();

        int[][] a = new int[rows][cols];
        System.out.println("Enter " + (rows * cols) + " integers (space or newline separated):");
        for (int r = 0; r < rows; r++) {
            for (int c = 0; c < cols; c++) {
                a[r][c] = sc.nextInt();
            }
        }

        System.out.println("Original matrix:");
        for (int[] row : a) {
            System.out.println(Arrays.toString(row));   // prints each row on new line
        }

        int[][] res = tm.transpose(a);

        System.out.println("Transposed matrix:");
        for (int[] row : res) {
            System.out.println(Arrays.toString(row));   // prints each transposed row on new line
        }

        sc.close();
    }
}