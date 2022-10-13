public class Main {
    public static void main(String args[]) {
        int row = 2, column = 3;
        int[][] matrix = { {1, 2, 3}, {4, 5, 6} };
        System.out.println("Matris : ");
        print(matrix);
        int[][] transpose = new int[column][row];
        for(int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                transpose[j][i] = matrix[i][j];
            }
        }
        System.out.println("Transpoze : ");
        print(transpose);
    }
    public static void print(int[][] matrix) {
        for(int[] row : matrix) {
            for (int column : row) {
                System.out.print(column + "    ");
            }
            System.out.println();
        }
    }
}