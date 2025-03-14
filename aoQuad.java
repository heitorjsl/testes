import javax.swing.JOptionPane;

public class aoQuad {
    public static void main (String[] args){
        double n1, n2, n3, n4, resultado;
        n1 = Double.parseDouble(JOptionPane.showInputDialog("digite o primeiro número: "));
        n2 = Double.parseDouble(JOptionPane.showInputDialog("digite o segundo número: ")); 
        n3 = Double.parseDouble(JOptionPane.showInputDialog("digite o terceiro número: "));
        n4 = Double.parseDouble(JOptionPane.showInputDialog("digite o quarto número: ")); 
        resultado = (n1*n1) + (n2*n2) + (n3*n3) + (n4*n4) ;
       JOptionPane.showMessageDialog(null, "o resultado é: " + resultado);
}
}
