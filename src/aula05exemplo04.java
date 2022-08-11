import javax.swing.*;

public class aula05exemplo04 {
    public static void main(String[] args) {
        String nome = JOptionPane.showInputDialog("Digite o seu nome: ");

        String mensagem = nome + " está estudando POO em ADS 2";

        JOptionPane.showMessageDialog(null,mensagem,"teste",JOptionPane.INFORMATION_MESSAGE);
    }
}
