package clone;
import java.lang.*;
public class CloneTest {
    public static void main(String[] args) throws CloneNotSupportedException {
        String s = "aa";
        s ="qq";
        System.out.println(s);
        Clone c1 = new Clone("first text");
        c1.setText("new text");
        Clone c2 = c1.clone();
        c2.setText("clone text");
        System.out.println(c1.getText());
        System.out.println(c2.getText());


    }
}
