package clock;
import java.util.*;
public class ArrayListMagnet
{
    public static void main(String[] args) {
        ArrayList<String> myList = new ArrayList<String>();
        myList.add(0,"zero");
        myList.add(1,"one");
        myList.add(2,"two");
        myList.add(3,"tree");
        printLa(myList);
        if(myList.contains("tree")){
            myList.add(4,"four");
        }
        if(myList.indexOf("four")  != 5 ){
            myList.remove(3);
            myList.add(4,"4.2");
        }
        printLa(myList);


    }
    public int aa(int x){
        return x;
    }
    public String aa(String x){
        return x;
    }
    public static void printLa(ArrayList<String>  data){
        for(String key : data) {
            System.out.print(key + " ");
        }
            System.out.println("");
    }
}
