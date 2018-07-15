import java.util.Date;
public class Parsing {
    public static void main(String[] args) {
       String s = String.format("%,6.5f",10.000112);
       String date = String.format("%tc",new Date());
        System.out.println(date);
    }
}
