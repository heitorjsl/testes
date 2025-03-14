import javax.swing.JOptionPane;

public class bXh {
        public static void main (String[] args){
        double n1, n2, resultado;
        n1 = Double.parseDouble(JOptionPane.showInputDialog("digite a base: "));
        n2 = Double.parseDouble(JOptionPane.showInputDialog("digite a altura: ")); 
        resultado = n1*n2;
       JOptionPane.showMessageDialog(null, "o total é: " + resultado);
    
}
}