package RyanAndMonica;

public class TestSync implements Runnable{
    private int  balance;
    public void run(){
        for(int i =0; i<10;i++){
            increment();
            System.out.println(" --- "+Thread.currentThread().getName()+" balance is "+balance);
        }
    }
    public synchronized void increment(){
        int i = balance;
        balance = i + 1;
    }

    public static void main(String[] args) {
        TestSync ts = new TestSync();
        Thread one = new Thread(ts);
        Thread two = new Thread(ts);
        Thread tree = new Thread(ts);
        one.setName("One");
        two.setName("Two");
        tree.setName("Three");
        one.start();
        two.start();
        //tree.start();
    }
}
