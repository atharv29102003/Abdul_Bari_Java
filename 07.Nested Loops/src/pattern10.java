public class pattern10 {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            // Print spaces and left-side stars
            for (int j = 1; j <= 5; j++) {
                if ((i + j) > 5) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }

            // Print right-side extra stars
            for (int k = 1; k < 2 * i - 1; k++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
