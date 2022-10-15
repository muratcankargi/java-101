public class ArrayLetter {
    public static void main(String[] args) {
        String[][] matrix = new String[7][4];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if ((i == 0 && j != 3) || (i == matrix.length - 1 && j != 3) || (i == 3 && j != 3)) {
                    matrix[i][j] = "*  ";
                } else if ((j == 0) || (j == matrix[i].length - 1 && i != 0 && i != 3 && i != 6)) {
                    matrix[i][j] = "* ";
                } else {
                    matrix[i][j] = "   ";
                }
                System.out.print(matrix[i][j]);
            }
            System.out.println("");
        }
    }
}
