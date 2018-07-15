import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class GuIFry extends JFrame{

      private JLabel text1;
      public GuIFry(){
          super("eto zagolovok okna");
          setLayout(new FlowLayout());
          text1 = new JLabel("Kormi enota");
          text1.setToolTipText("eto ne shutka");
          add(text1);
      }
















}
