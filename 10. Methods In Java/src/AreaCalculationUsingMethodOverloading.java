public class AreaCalculationUsingMethodOverloading {
    static double area(double radius) {
        return Math.PI * radius * radius;
    }

    static double area(double length, double breadth) {
        return length * breadth;
    }

    public static void main(String[] args) {
        double l = 12, b = 14, r = 9;
        System.out.println(area(l, b));
        System.out.println(area(r));
    }
}
