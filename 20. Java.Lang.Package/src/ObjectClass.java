class MyObject {
    @Override
    public String toString() {
        return "My Object";
    }

    @Override
    public int hashCode() {
        return 100;
    }

    @Override
    public boolean equals(Object o) {
        return this.hashCode() == o.hashCode();
    }
}

public class ObjectClass {
    public static void main(String[] args) {
        MyObject o1 = new MyObject();
        MyObject o2 = new MyObject();

        System.out.println(o1.equals(o2));
    }
}
