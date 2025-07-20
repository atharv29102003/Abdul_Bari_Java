import java.util.Scanner;

public class young {
    public static void main(String[] args) {
        int age;
        Scanner sc = new Scanner(System.in);
        age = sc.nextInt();
        if (age < 15 && age > 0) {
            System.out.println("Infant");
        } else if (age >= 15 & age <= 60) {
            System.out.println("Young");
        } else {
            System.out.println("Old");
        }
        sc.close();
        sc.close();
    }
}
