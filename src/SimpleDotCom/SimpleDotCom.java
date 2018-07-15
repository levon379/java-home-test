package SimpleDotCom;

import java.util.ArrayList;
public class SimpleDotCom {
    private  ArrayList<String> locationCells;

    void setLocationCells(ArrayList<String> loc){
        locationCells = loc;
    }
    public String checkYourself(String  UserIndex){

        String result = "miss";
        int index = locationCells.indexOf(UserIndex);

        if(index>=0){
            locationCells.remove(index);
        }
        if(locationCells.isEmpty()){
            result = "kill";
        }else {
            result = "hit";
        }
        System.out.println(result);
        return result;
    }
}
