import javax.swing.JOptionPane;

public class teste01{
   public static void main(String[] args){
    double nota= Double.parseDouble(JOptionPane.showInputDialog("digite sua nota: "));
   if(nota>=70){
    JOptionPane.showMessageDialog(null, "Aprovado");
   }
   else{
    JOptionPane.showMessageDialog(null, "Reprovado");
    



   }     
   } 
}