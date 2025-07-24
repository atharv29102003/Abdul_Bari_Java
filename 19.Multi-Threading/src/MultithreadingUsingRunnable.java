class MyRunnable implements Runnable {
    @Override
    public void run() {
        int i = 1;
        while (true) {
            System.out.println(i + "Hello");
            i++;
        }
    }
}

public class MultithreadingUsingRunnable // implements Runnable //extends Thread
{
    /*
     * public void run()
     * {
     * int i=1;
     * while(true)
     * {
     * System.out.println(i+"Hello");
     * i++;
     * }
     * }
     */

    public static void main(String[] args) {

        // MyThread t=new MyThread();
        // ThreadTest t=new ThreadTest();
        MyRunnable t = new MyRunnable();
        Thread th = new Thread(t);

        th.start();

        int i = 1;
        while (true) {
            System.out.println(i + "World");
        }

    }

}
