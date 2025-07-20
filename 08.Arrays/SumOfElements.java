public class SumOfElements {
    public static void main(String[] args) {
        int sum = 0;
        int A[] = { 3, 9, 7, 8, 12, 6, 15, 5, 4, 10 };
        for (int i = 0; i < A.length; i++) {
            sum = sum + A[i];
        }
        System.out.println(sum);
    }
}
