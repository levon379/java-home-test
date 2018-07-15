

import java.io.*;

public class Sort {
    public static void main(String[] args) {
            BufferedWriter writer = null;
        try {
            //file reader
            File myFile = new File("file.txt");
            FileReader fileReader = new FileReader(myFile);
            BufferedReader reader = new BufferedReader(fileReader);
            String line = null;

            //file writer
            File wrFile = new File("a.txt");
            writer = new BufferedWriter(new FileWriter(wrFile));
            String[] array = new String[5];
            while((line = reader.readLine()) !=null){
                for(int i = 0; i < 2; i++){
                    array[i] = line;
                writer.write(array[i]);
                }
                writer.newLine();
            }
            reader.close();
            writer.close();
        }catch(Exception ex){
            ex.printStackTrace();
        }













    }
}
