package sort;
import java.util.*;
import java.io.*;

public class JukeBox3 {
    ArrayList<Song> songList = new ArrayList<Song>();

    public static void main(String[] args) {
        JukeBox3 jk = new JukeBox3();
        jk.go();
    }
    public void go(){
        getSongs();
        Collections.sort(songList);
        System.out.println(songList);
    }
    void getSongs(){
        try{
            File file = new File("C:\\Users\\levon\\IdeaProjects\\javaApp\\src\\sort\\SongList.txt");
            BufferedReader reader = new BufferedReader(new FileReader(file));
            String line = null;
            while((line = reader.readLine()) != null){
                addSong(line);
            }
        }catch(Exception ex){
            ex.printStackTrace();
        }
    }
     public void addSong(String lineToParse){
        String[] tokens = lineToParse.split("/");
        Song nextSong = new Song(tokens[0],tokens[1],tokens[2],tokens[3]);
        songList.add(nextSong);
     }

}

