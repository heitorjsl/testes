import javax.swing.JOptionPane;

public class cotDolar {
    public static void main (String[] args){
        double n1, n2, resultado;
        n1 = Double.parseDouble(JOptionPane.showInputDialog("digite o valor: "));
        n2 = Double.parseDouble(JOptionPane.showInputDialog("digite a cotação: ")); 
        resultado = n1*n2;
       JOptionPane.showMessageDialog(null, "o total é: " + resultado);
}
}
