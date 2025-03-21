import javax.swing.JOptionPane;
public class ex03 {
    public static void main(String[] args) {
        double a=  Integer.parseInt(JOptionPane.showInputDialog("Digite numero"));
        double b=  Integer.parseInt(JOptionPane.showInputDialog("Digite numero"));
        double c=  Integer.parseInt(JOptionPane.showInputDialog("Digite numero"));

        if (a>b && a>c)  {
            JOptionPane.showMessageDialog(null,"o maior numero é "+a);
            
            
        } else if (b>a && b>c) {
            JOptionPane.showMessageDialog(null,"o maior numero é "+b);
        }
 else{
    JOptionPane.showMessageDialog(null,"o maior numero é "+c);

 }


    }
}
