import java.io.*;
import java.net.Socket;
import java.util.Scanner;


public class ChatSocketClient {
    public static void main(String[] args) throws Exception
    {
        Socket sock = new Socket("127.0.0.1", 3000);
        // reading from keyboard (keyRead object)

        String username;
        Scanner enter = new Scanner(System.in);
        System.out.println("enter new name");
        username = enter.nextLine();

        FileWriter fl = new FileWriter("file.txt");
        fl.write(username);
        fl.close();

        BufferedReader br = new BufferedReader(new FileReader("file.txt"));
        String st;
        while((st=br.readLine()) != null){
            System.out.println(st);
        }

        BufferedReader keyRead = new BufferedReader(new InputStreamReader(System.in));
        // sending to client (pwrite object)
        OutputStream ostream = sock.getOutputStream();
        PrintWriter pwrite = new PrintWriter(ostream, true);

        // receiving from server ( receiveRead  object)
        InputStream istream = sock.getInputStream();
        BufferedReader receiveRead = new BufferedReader(new InputStreamReader(istream));

        System.out.println("Start the chitchat, type and press Enter key");

        String receiveMessage, sendMessage;
        while(true)
        {
            sendMessage = keyRead.readLine();  // keyboard reading
            pwrite.println(sendMessage);       // sending to server
            pwrite.flush();                    // flush the data
            if((receiveMessage = receiveRead.readLine()) != null) //receive from server
            {
                System.out.println(receiveMessage); // displaying at DOS prompt
            }
        }
    }
}
