public class OneDimensionalArray {
    public static void main(String[] args) {
        int A[] = new int[5];
        int b[] = { 1, 2, 3, 4, 5 };
        int c[];
        c = new int[5];
        b[2] = 15;
        for (int i = 0; i < A.length; i++) {
            System.out.print(A[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < b.length; i++) {
            System.out.print(b[i] + " ");
        }
        System.out.println();
        c[3] = 10;
        for (int x : c) {
            System.out.print(x + " ");
        }
    }
}
