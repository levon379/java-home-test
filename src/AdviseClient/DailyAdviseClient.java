package AdviseClient;
import java.io.*;
import java.net.*;
public class DailyAdviseClient
{
    //page 484
    String[] advicList = {"te1","tex","tfvsf"};
    public void go(){
     try{
        ServerSocket serberSock = new ServerSocket(4242);
        while(true){
            Socket sock = serberSock.accept();
            PrintWriter writer = new PrintWriter(sock.getOutputStream());
            String advice = getAdvice();
            writer.println(advice);
            writer.close();
            System.out.println(advice);
        }
       /* InputStreamReader streamReader = new InputStreamReader(s.getInputStream());
        BufferedReader reader = new BufferedReader(streamReader);

        String advice = reader.readLine();
         System.out.println("should be "+advice);
         reader.close();*/

     }   catch(IOException ex){
         ex.printStackTrace();
     }

    }
    public String getAdvice(){
        int random =(int) (Math.random()*advicList.length);
        return advicList[random];
    }
    public static void main(String[] args) {
        DailyAdviseClient d = new DailyAdviseClient();
        d.go();
    }
}
