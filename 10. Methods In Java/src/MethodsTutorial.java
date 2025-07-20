public class MethodsTutorial {
    static int max(int x, int y) {
        if (x > y)
            return x;
        else
            return y;
    }

    public static void main(String[] args) throws Exception {
        int a = 13, b = 12, c;
        c = max(a, b);
        System.out.println(c);
    }
}
