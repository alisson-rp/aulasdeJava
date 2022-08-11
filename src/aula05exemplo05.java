import javax.swing.*;

public class aula05exemplo05 {
    public static void main(String[] args) {

        double resultado;

        double A = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor de A: "));
        double B = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor de B: "));
        double C = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor de C: "));

        double R = (B * B) - (4 * A * C);
        if ( R >= 0) {
            double XI = ((B * (-1)) + Math.sqrt(R)) / (2 * A);
            double XII = ((B * (-1)) - Math.sqrt(R)) / (2 * A);

            JOptionPane.showMessageDialog(null, " o valor de XI é ->" + XI);
            JOptionPane.showMessageDialog(null, " o valor de XII é ->" + XII);
        }else{
            JOptionPane.showMessageDialog(null, "Variavel B não pode ser um numero que de negativo!!!",
                    "ATENÇÃO",JOptionPane.WARNING_MESSAGE);
        }
    }
}
