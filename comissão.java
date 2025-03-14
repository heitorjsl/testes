import javax.swing.JOptionPane;

public class comissão {
       public static void main (String[] args){
        double n1,resultado;
        n1 = Double.parseDouble(JOptionPane.showInputDialog("digite o valor: "));
        resultado = n1 + (n1/100)*5 ;
       JOptionPane.showMessageDialog(null, "o total é: " + resultado); 
    
}
}