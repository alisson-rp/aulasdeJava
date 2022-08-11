import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class aula06exerc02 {
    public static void main(String[] args) {
        List<Integer> lista = new ArrayList<>();
        int maior = 0;
        int menor = 999999;
        for (int i = 0; i < 10; i++ ) {
            lista.add(Integer.parseInt(JOptionPane.showInputDialog("Digite um valor")));
        }
        for (Integer n : lista){
            if (maior < n){
                maior = n;
            }else if (menor > n){
                menor = n;
            }
        }

        JOptionPane.showMessageDialog(null," O maior numero é "+maior+" \n O menor numero é "+menor);
    }
}
