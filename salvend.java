import javax.swing.JOptionPane;

public class salvend {
    public static void main (String[] args){
        double n1,n2,n3,resultado;
        n1 = Double.parseDouble(JOptionPane.showInputDialog("digite carros vendidos: "));
        n2 = Double.parseDouble(JOptionPane.showInputDialog("digite o valor salario: "));
        n3 = Double.parseDouble(JOptionPane.showInputDialog("digite o valor vendas mes: "));
        resultado =((n3/100)*n1)+((n3/100)*5)+n2;
       JOptionPane.showMessageDialog(null, "o total é: " + resultado); 
}
}