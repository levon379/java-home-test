package Thread;

import java.io.IOException;

public class MyRunnable implements Runnable
{
    public void run(){
        System.out.println("run");
        go();
    }
    public void go(){
        try{
            Thread.sleep(2000);
        }catch(InterruptedException ex){
            ex.printStackTrace();
        }
        doMore();
    }
    public void doMore(){
        System.out.println("more");
    }
}
