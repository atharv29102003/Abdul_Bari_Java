import java.util.Scanner;

public class ReverseIntegerAndArrayUsingMethodOverloading {

    int reverse(int n) {
        int rev = 0;
        while (n > 0) {
            rev = rev * 10 + n % 10;
            n = n / 10;
        }
        return rev;
    }

    int[] reverse(int A[]) {
        int B[] = new int[A.length];
        for (int i = A.length - 1, j = 0; i >= 0; i--, j++)
            B[j] = A[i];
        return B;
    }

    public static void main(String[] args) {
        ReverseIntegerAndArrayUsingMethodOverloading obj = new ReverseIntegerAndArrayUsingMethodOverloading();

        int A[] = { 1, 2, 3, 4, 5, 6 };
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();

        int[] reversedArray = obj.reverse(A);
        int reversedNumber = obj.reverse(n);

        System.out.print("Reversed Array: ");
        for (int i = 0; i < reversedArray.length; i++) {
            System.out.print(reversedArray[i] + " ");
        }

        System.out.println("\nReversed Number: " + reversedNumber);
        sc.close();
        sc.close();
    }
}
