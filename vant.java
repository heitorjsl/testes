import javax.swing.JOptionPane;

public class vant {
           public static void main (String[] args){
        double n1,resultado;
        n1 = Double.parseDouble(JOptionPane.showInputDialog("digite o valor: "));
        resultado = n1 - 1 ;
       JOptionPane.showMessageDialog(null, "o total é: " + resultado); 
    
}
}

