public class w2d2t15_DiagonalMatrix {
    public static void main(String[] args) {


        int matrixSize = 15;

        int[][] matrix = new int[matrixSize][matrixSize];

        for (int r = 0; r < matrixSize; r++) {
            for (int c = 0; c < matrixSize;c++) {
                if (r == c) {
                    matrix[r][c] = 1;
                    System.out.print(matrix[r][c]);
                } else {
                    matrix[r][c] = 0;
                    System.out.print(matrix[r][c]);

                }

        } System.out.println();}
    }
}




// - Create (dynamically) a two dimensional array
//   with the following matrix. Use a loop!
//
//   1 0 0 0
//   0 1 0 0
//   0 0 1 0
//   0 0 0 1
//
// - Print this two dimensional array to the output