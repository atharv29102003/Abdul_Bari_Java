
import java.util.Scanner;

public class Prime {
    static boolean isPrime(int n) {
        if (n <= 1)
            return false; // 0 and 1 are not prime
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0)
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(isPrime(n));
        sc.close();
        sc.close();
    }
}
