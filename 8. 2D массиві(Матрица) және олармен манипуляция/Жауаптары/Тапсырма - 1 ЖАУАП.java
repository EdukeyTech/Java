public class MatrixExample {
    public static void main(String[] args) {
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        }; // Массив жариялау жолы
        
        for (int i = 0; i < matrix.length; i++) { // әр жол үшін
            for (int j = 0; j < matrix[i].length; j++) { // әр жолдың өзіндік элементі үшін
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
