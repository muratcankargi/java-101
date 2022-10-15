public class ArrayTranspose {
    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
        };

        int[][] transposeMatrix = new int[matrix[0].length][matrix.length];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                transposeMatrix[j][i]=matrix[i][j];
            }
        }
        for(int[] a:transposeMatrix){
            for(int b:a){
                System.out.print(b+" ");
            }
            System.out.println("");
        }

    }
}
