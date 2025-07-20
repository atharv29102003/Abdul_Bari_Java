interface Test {
    final static int X = 10;

    public abstract void meth1();

    public abstract void meth2();

    public static void meth3() {
        System.out.println("Meth3 of Test");
    }
}

interface Test2 extends Test {
    void meth4();
}

class My implements Test2 {
    @Override
    public void meth1() {
        System.out.println("Meth1");
    }

    @Override
    public void meth2() {
        System.out.println("Meth2");
    }

    @Override
    public void meth4() {
        System.out.println("Meth4");
    }
}

public class InterfacePractise {
    public static void main(String[] args) {
        System.out.println(Test.X);
        Test t = new My();
        t.meth1();
        t.meth2();
        Test.meth3();
    }
}