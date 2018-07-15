import javax.swing.JOptionPane;
public class Gui {
    public static void main(String[] args) {
        String fn = JOptionPane.showInputDialog("Vvedi pervoe chislo");
        String sn = JOptionPane.showInputDialog("Vvedi vtoroe chislo");

        int num1 = Integer.parseInt(fn);
        int num2 = Integer.parseInt(sn);

        int sum = num1 +num2;

        JOptionPane.showMessageDialog(null, "summa rovna "+sum,"tipa kalkulyator", JOptionPane.PLAIN_MESSAGE);
    }
}
