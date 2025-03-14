import javax.swing.JOptionPane;

public class dv {
    public static void main (String[] args){
        double n1, n2, n3,n4,n5,n6,resultado;
        n1 = Double.parseDouble(JOptionPane.showInputDialog("dia nascimento: "));
        n2 = Double.parseDouble(JOptionPane.showInputDialog("mês nascimento: "));
        n3 = Double.parseDouble(JOptionPane.showInputDialog("ano nascimento: "));
        n4 = Double.parseDouble(JOptionPane.showInputDialog("dia atual"));
        n5 = Double.parseDouble(JOptionPane.showInputDialog("mês atual"));
        n6 = Double.parseDouble(JOptionPane.showInputDialog("ano atual"));
        resultado = (n6 - n3) * 365.25+ (n5-n2)*30.4+ (n4-n1);
       JOptionPane.showMessageDialog(null, "dias vividos: " + resultado);
}
}
