import javax.swing.JOptionPane;

public class real {
           public static void main (String[] args){
        double n1,n2,resultado;
        n1 = Double.parseDouble(JOptionPane.showInputDialog("salario: "));
        n2 = Double.parseDouble(JOptionPane.showInputDialog("percentual reajuste: "));
        resultado = ((n1/100)*n2)+n1;
       JOptionPane.showMessageDialog(null, "o total é: " + resultado); 
    
}
}
