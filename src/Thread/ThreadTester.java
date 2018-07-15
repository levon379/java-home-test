package Thread;

public class ThreadTester {
    public static void main(String[] args) {
        Runnable threadJob = new MyRunnable();
        Thread th = new Thread(threadJob);
        th.start();
        System.out.println("back in main");
    }


}
