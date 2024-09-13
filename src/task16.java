import java.util.Scanner;

public class task16 {
    static class Matrix {
        int[][] data;
        Matrix(int[][] d) { data = d; }
        Matrix add(Matrix m) {
            int[][] result = new int[data.length][data[0].length];
            for (int i = 0; i < data.length; i++)
                for (int j = 0; j < data[i].length; j++)
                    result[i][j] = data[i][j] + m.data[i][j];
            return new Matrix(result);
        }
        void print() {
            for (int[] row : data) {
                for (int val : row) System.out.print(val + " ");
                System.out.println();
            }
        }
    }
    public static void main(String[] args) {
        int[][] data1 = { {1, 2}, {3, 4} }, data2 = { {5, 6}, {7, 8} };
        Matrix m1 = new Matrix(data1), m2 = new Matrix(data2);
        m1.add(m2).print();
    }
}
