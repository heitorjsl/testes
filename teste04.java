import javax.swing.JOptionPane;
public class teste04 {
    public static void main(String[] args) {
        int idade= Integer.parseInt(
            JOptionPane.showInputDialog("Digite sua idade")
        );
        String podeDirigir;
 podeDirigir = idade >=18 ? "Sim,vc pode": "Não";
 System.out.println(podeDirigir);
 }
}