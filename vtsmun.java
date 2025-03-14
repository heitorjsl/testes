import javax.swing.JOptionPane;

public class vtsmun {
           public static void main (String[] args){
        double n1,n2,n3,n4,r1,r2,r3,r4;
        n1 = Double.parseDouble(JOptionPane.showInputDialog("eleitores totais: "));
        n2 = Double.parseDouble(JOptionPane.showInputDialog("votos nulos: "));
        n3 = Double.parseDouble(JOptionPane.showInputDialog("votos em branco: "));
        n4 = Double.parseDouble(JOptionPane.showInputDialog("votos validos: "));
       r1= (n4/n1)*100;
       r2= (n2/n1)*100;
       r3= (n3/n1)*100;
       r4= (r3+r2+r1);
       JOptionPane.showMessageDialog(null, "o total de votos validos são: " +r1);
       JOptionPane.showMessageDialog(null, "o total de votos nulos são: " +r2); 
       JOptionPane.showMessageDialog(null, "o total de votos em branco são: " +r3);
       JOptionPane.showMessageDialog(null, "o total é " +r4); 
 
        
       
    
}
}