class Rectangle {
    public double length, breadth;

    public double area() {
        return length * breadth;
    }

    public double perimeter() {
        return 2 * (length + breadth);
    }
}

public class Rectangle1 {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle();
        r1.breadth = 22;
        r1.length = 24;
        System.out.println("area " + r1.area());
        System.out.println("Perimeter " + r1.perimeter());
    }
}
