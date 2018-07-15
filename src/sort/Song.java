package sort;

public class Song implements Comparable<Song> {
    String title;
    String artist;
    String raiting;
    String bmw;
    public int compareTo(Song s){
        return title.compareTo(s.getTitle());
    }
    Song(String t,String a,String r,String b){
        title = t;
        artist = a;
        raiting = r;
        bmw = b;
    }
    public String getTitle(){
        return title;
    }
    public String getArtist(){
        return artist;
    }
    public String getRaiting(){
        return raiting;
    }
    public String getBmw(){
        return bmw;
    }
}
