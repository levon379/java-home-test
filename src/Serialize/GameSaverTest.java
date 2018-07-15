package Serialize;
import java.io.*;

public class GameSaverTest {
    public static void main(String[] args) {
        GameCharacter one = new GameCharacter(50, "Elf", new String[] {"boo","swird","use"});
        GameCharacter two = new GameCharacter(50, "Santa", new String[] {"boo","swird","use"});
        GameCharacter tree = new GameCharacter(50, "Magic", new String[] {"boo","swird","use"});

        try{
            ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream("Game.ser"));
            os.writeObject(one);
            os.writeObject(two);
            os.writeObject(tree);
        }catch(IOException ex){
            ex.printStackTrace();
        }
        one = null;
        two = null;
        tree = null;

        //now read back
        try{
            ObjectInputStream is = new ObjectInputStream(new FileInputStream("Game.ser"));
           /* GameCharacter restoreOne = (GameCharacter) is.readObject();
            GameCharacter restoreTwo = (GameCharacter) is.readObject();
            GameCharacter restoreTree = (GameCharacter) is.readObject();*/
/*
            System.out.println("once type"+ restoreOne.getType());
            System.out.println("two type"+ restoreTwo.getType());
            System.out.println("tree type"+ restoreTree.getType());*/
        }catch (IOException ex){
            ex.printStackTrace();
        }
    }

}
