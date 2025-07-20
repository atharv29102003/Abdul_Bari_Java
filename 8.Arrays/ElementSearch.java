
import java.util.Scanner;

public class ElementSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A[] = { 3, 2, 9, 5, 8, 4, 14, 6, 7, 18 };
        System.out.println("enter the value of the key: ");
        int key = sc.nextInt();
        for (int i = 0; i < A.length; i++) {
            if (A[i] == key) {
                System.out.print("The number is found at index : " + i);
                System.exit(0);
            }
        }
        System.out.println("Invalid key");
    }
}
