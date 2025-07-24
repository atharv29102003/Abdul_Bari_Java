class MyData {
    public synchronized void display(String str) {
        for (int i = 0; i < str.length(); i++) {
            System.out.print(str.charAt(i));
            try {
                Thread.sleep(100); // Simulate delay
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt(); // Restore interrupted status
                System.out.println("Thread was interrupted.");
            }
        }
    }
}

class MyThread1 extends Thread {
    MyData d;

    public MyThread1(MyData d) {
        this.d = d;
    }

    @Override
    public void run() {
        d.display("Hello World");
    }

}

class MyThread2 extends Thread {
    MyData d;

    public MyThread2(MyData d) {
        this.d = d;
    }

    @Override
    public void run() {
        d.display("Welcome All");
    }

}

public class Synchronisation {
    public static void main(String[] args) {
        MyData data = new MyData();

        MyThread1 t1 = new MyThread1(data);
        MyThread2 t2 = new MyThread2(data);

        t1.start();
        t2.start();

    }
}
