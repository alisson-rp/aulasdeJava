import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class aula06exerc01 {
    public static void main(String[] args) {
        int media = 0;
        List<Integer> lista = new ArrayList<>();

        for (int i = 0; i < 10; i++ ) {
            lista.add(Integer.parseInt(JOptionPane.showInputDialog("Digite um valor")));
        }
        for (Integer N : lista){
            media += N;
        }

        float resultado = media / 10f;
        JOptionPane.showMessageDialog(null,"A Media de "+resultado);
    }
}
