class myThread extends Thread {
    @Override
    public void run() {
        int i = 1;
        while (true) {
            System.out.println(i + "HELLO");
            i++;
        }
    }
}

public class MultithreadingUsingThread {
    public static void main(String[] args) throws Exception {
        myThread t = new myThread();
        t.start();
        int i = 1;
        while (true) {
            System.out.println(i + "WORLD");
            i++;
        }
    }
}

// Another method
/*
 * public class MultithreadingUsingThread extends Thread {
 * 
 * @Override
 * public void run() {
 * int i = 1;
 * while (true) {
 * System.out.println(i + "HELLO");
 * i++;
 * }
 * }
 * public static void main(String[] args) throws Exception {
 * MultithreadingUsingThread t = new MultithreadingUsingThread();
 * t.start();
 * int i = 1;
 * while (true) {
 * System.out.println(i + "WORLD");
 * i++;
 * }
 * }
 * }
 */