package Serialize;

import java.io.Serializable;

public class GameCharacter implements Serializable {
    int power;
    String type;
    String[] weapon;

    public GameCharacter(int p, String t, String[] w) {
        power = p;
        type = t;
        weapon = w;
    }

    public int getPower() {
        return power;
    }

    public String getType() {
        return type;
    }

    public String getWeapons() {
        String waeponsList = "";
        for (int i = 0; i < weapon.length; i++) {
            waeponsList += weapon[i] + "";
        }
        return waeponsList;
    }


}

