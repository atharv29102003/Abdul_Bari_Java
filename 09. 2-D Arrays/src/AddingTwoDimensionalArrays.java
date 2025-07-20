public class AddingTwoDimensionalArrays {
    public static void main(String[] args) {
        int B[][] = { { 1, 2, 3 }, { 2, 4, 6 }, { 3, 6, 9 } };

        int A[][] = { { 1, 5, 3 }, { 2, 8, 6 }, { 3, 7, 9 } };

        int C[][] = new int[3][3];

        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[0].length; j++) {
                C[i][j] = A[i][j] + B[i][j];
            }
        }
        for (int x[] : C) {
            for (int y : x) {
                System.out.print(y + " ");
            }
            System.out.println();
        }
    }
}
