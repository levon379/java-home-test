package exception;

import java.io.*;
import java.util.*;
public class Box implements Serializable{
    private int width;
    private int height;

    public void setWidth(int w){
        width = w;
    }
    public void setHeight(int h){
        height = h;
    }

    public static void main(String[] args) {
        Box myBox = new Box();
        myBox.setHeight(20);
        myBox.setWidth(30);

        try{
            FileOutputStream fs = new FileOutputStream("foo.ser");
            ObjectOutputStream os = new ObjectOutputStream(fs);
            os.writeObject(myBox);
            os.close();

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

        }
        catch(Exception ex){
            ex.printStackTrace();
        }
    }
}
