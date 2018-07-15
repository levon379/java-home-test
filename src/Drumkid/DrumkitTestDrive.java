package Drumkid;

public class DrumkitTestDrive {
    public static void main(String[] args) {
        Drumkit d = new Drumkit();
        d.snare = false;
        if(d.snare == true){
            d.playSnare();
        }
        d.playSnare();
        d.playTopHat();
    }
}
