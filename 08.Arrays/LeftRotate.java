public class LeftRotate {
    public static void main(String[] args) {
        int A[] = { 3, 2, 9, 5, 8, 4, 14, 6, 7, 18 };
        int temp = A[0];
        for (int i = 1; i < A.length; i++) {
            A[i - 1] = A[i];
        }
        A[A.length - 1] = temp;
        for (int x : A) {
            System.out.print(x + " ");
        }
    }
}
