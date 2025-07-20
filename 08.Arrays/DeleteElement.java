public class DeleteElement {
    public static void main(String[] args) {
        int A[] = new int[10];
        A[0] = 3;
        A[1] = 9;
        A[2] = 20;
        A[3] = 7;
        A[4] = 8;
        A[5] = 12;
        A[6] = 6;

        int n = 7; // Number of elements in array

        System.out.println("Before deletion:");
        for (int i = 0; i < n; i++)
            System.out.print(A[i] + ",");
        System.out.println();

        int indexToDelete = 2; // Delete element at index 2 (which is 20)

        // Shift elements to the left from indexToDelete
        for (int i = indexToDelete; i < n - 1; i++) {
            A[i] = A[i + 1];
        }
        n--; // Decrease size of array

        System.out.println("After deletion:");
        for (int i = 0; i < n; i++)
            System.out.print(A[i] + ",");
        System.out.println();
    }
}
