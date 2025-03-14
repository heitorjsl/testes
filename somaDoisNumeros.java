import javax.swing.JOptionPane;
public class somaDoisNumeros{
    public static void main (String[] args){
        double n1, n2, resultado;
        n1 = Double.parseDouble(JOptionPane.showInputDialog("digite o primeiro número: "));
        n2 = Double.parseDouble(JOptionPane.showInputDialog("digite o segundo número: ")); 
        resultado = n1 + n2;
       JOptionPane.showMessageDialog(null, "o resultado é: " + resultado);
    }
}