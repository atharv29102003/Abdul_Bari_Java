public class IncreasingSize {
    public static void main(String[] args) {
        int A[] = { 1, 2, 3, 4, 5 };
        int B[] = new int[10];
        System.out.println("the length of A Before is " + A.length);
        for (int i = 0; i < A.length; i++) {
            B[i] = A[i];
        }
        A = B;
        System.out.println("Length of A After is " + A.length);

    }
}
