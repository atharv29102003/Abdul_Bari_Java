public class printing {
    public static void main(String[] args) throws Exception {
        int a = 10, b = 20;
        System.out.println("Sum of " + a + " and " + b + " is " + (a + b));
        // here we are concatinating a string and a variable using a + and we have
        // increased the precedence using a () in a+b so that it will get executed first
    }
}
