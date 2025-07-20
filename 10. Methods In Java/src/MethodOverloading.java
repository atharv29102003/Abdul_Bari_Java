class Test {
    public int max(int a, int b) {
        return a > b ? a : b;
    }

    public int max(int a, int b, int c) {
        if (a > b && a > c) {
            return a;
        } else if (b > c) {
            return b;
        } else {
            return c;
        }
    }
}

public class MethodOverloading {
    public static void main(String[] args) {
        Test t = new Test();
        System.out.println("Max of 10 and 5: " + t.max(10, 5));
        System.out.println("Max of 10, 15 and 5: " + t.max(10, 15, 5));
    }
}
