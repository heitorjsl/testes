import javax.swing.JOptionPane;

public class car {
           public static void main (String[] args){
        double n1,resultado;
        n1 = Double.parseDouble(JOptionPane.showInputDialog("digite o valor de fabrica: "));
        resultado = (n1/100)*28+(n1/100)*45+n1;
       JOptionPane.showMessageDialog(null, "o total é: " + resultado); 
    
}
}
