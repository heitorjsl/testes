import javax.swing.JOptionPane;
public class ex2203_2 {

    public static void main(String[] args) {
        double a, b, c,d,y1,y2;
        a=Double.parseDouble(JOptionPane.showInputDialog("digite valor A"));
        b=Double.parseDouble(JOptionPane.showInputDialog("digite valor B"));
        c=Double.parseDouble(JOptionPane.showInputDialog("digite valor C"));
        
        d=b*b-4*a*c;
       
        if (d<0){
            JOptionPane.showMessageDialog(null,"nn existem raizes reais");
        }else if (d==0){
            y1= -b / (2 * a);
            JOptionPane.showMessageDialog(null,"a raiz é"+ y1);
        }else{
            y1=(-b + Math.sqrt(d))/ (2 * a);
            y2=(-b - Math.sqrt(d))/ (2*a);
            JOptionPane.showMessageDialog(null, "As raízes reais são: \n y1 = " + y1 + "\n y2 = " + y2);
        }       
    }
}
