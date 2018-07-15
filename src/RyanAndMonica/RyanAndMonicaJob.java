package RyanAndMonica;

public class RyanAndMonicaJob implements Runnable{
    private BankAccount account = new BankAccount();

    public static void main(String[] args) {
        RyanAndMonicaJob theJob  =  new RyanAndMonicaJob();
        Thread one = new Thread(theJob);
        Thread two = new Thread(theJob);
        one.setName("Ryan");
        two.setName("Monica");
        one.start();
        two.start();
    }
    public void run(){
        for(int x = 0;x<10;x++){
            makeWithDrawls(10);
            if(account.getBalance()<0){
                System.out.println("OverDrawn");
            }
        }
    }
    public synchronized void makeWithDrawls(int amount){
        if(account.getBalance() >=0){
            System.out.println(Thread.currentThread().getName()+" is about to withdraw");
            try{
                System.out.println(Thread.currentThread().getName()+" is going to sleep");
                Thread.sleep(500);
            }catch(InterruptedException ex){
                ex.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName()+" wake up");
            account.withDraw(amount);
            System.out.println(Thread.currentThread().getName()+" completes the withdraw");
        }else{
            System.out.println("sorry for enough for "+Thread.currentThread().getName());
        }
    }
}
