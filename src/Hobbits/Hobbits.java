package Hobbits;

public class Hobbits {
    String name;

    public static void main(String[] args) {
        Hobbits[] h = new Hobbits[3];
        int z =0;
        while (z<5){

        h[z] = new Hobbits();
        h[z].name="Vlas";
        if(z == 1){
            h[z].name = "new name z =1";
        }
            if(z == 2){
                h[z].name = "new name z =2";
            }
            System.out.println(h[z].name);
            z++;
    }



    }
}
