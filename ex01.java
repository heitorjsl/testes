import javax.swing.JOptionPane;

public class ex01 {
    public static void main(String[] args) {
        double n=  Integer.parseInt(JOptionPane.showInputDialog("Digite numero"));
    {}
    if(n>=1){
            JOptionPane.showMessageDialog(null, "positivo");
        }else if(n<0){
        JOptionPane.showMessageDialog(null, "negativo");
        } else {
            JOptionPane.showMessageDialog(null, "O número é neutro.");
        }
    }
}
     


