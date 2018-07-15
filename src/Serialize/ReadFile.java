package Serialize;
import java.io.*;
public class ReadFile {
    public static void main(String[] args) {
        BufferedWriter writer = null;
        try {
            //create a temporary file
            String timeLog = "12.txt";
            File logFile = new File(timeLog);

            // This will output the full path where the file will be written to...
            System.out.println(logFile.getCanonicalPath());

            writer = new BufferedWriter(new FileWriter(logFile));
            writer.write("Hello world!");
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                // Close the writer regardless of what happens...
                writer.close();
            } catch (Exception e) {
            }
        }
    }
}
