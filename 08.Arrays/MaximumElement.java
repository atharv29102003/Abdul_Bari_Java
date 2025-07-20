public class MaximumElement {
    public static void main(String[] args) {
        int A[] = { 3, 2, 9, 5, 8, 4, 14, 6, 7, 18 };
        int max = A[0];
        for (int i = 0; i < A.length; i++) {
            if (A[i] > max) {
                max = A[i];
            }
        }
        System.out.println("The maximum value in an array is " + max);
    }
}
