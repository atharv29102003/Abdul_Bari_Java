public class MaximumElementInArray {
    static int max(int A[]) {
        int max = A[0];
        for (int i = 0; i < A.length; i++) {
            if (A[i] > max) {
                max = A[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int A[] = { 2, 3, 44, 56, 178, 94 };
        System.out.println("Maximum Element of an array is: " + max(A));
    }
}
