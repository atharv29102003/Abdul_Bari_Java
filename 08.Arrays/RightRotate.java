public class RightRotate {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };

        int last = arr[arr.length - 1];

        // Shift elements to the right
        for (int i = arr.length - 1; i > 0; i--) {
            arr[i] = arr[i - 1];
        }

        arr[0] = last;

        // Print rotated array
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
