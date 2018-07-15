package SimpleDotCom;
import java.io.*;
import java.util.Scanner;
public class GameHelper {
    public String getUserInput(String promt){
        String inputLine = null;
        System.out.println(promt + "");
   /*     try {
           // BufferedReader is = new BufferedReader(New Scanner(System.in));
           // inputLine = is.readLine();
            if(inputLine.length() == 0){
                return null;
            }
        }*/
       /* catch(IOException e){
            System.out.println("IOException" + e);
        }*/
        return inputLine;
    }
}
