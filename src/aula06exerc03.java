import javax.swing.*;
import java.util.HashSet;
import java.util.Set;

public class aula06exerc03 {
    public static void main(String[] args) {
        Set<Integer> valor = new HashSet<>();

        for ( int i=0; i<10; i++){
            valor.add(Integer.parseInt(JOptionPane.showInputDialog("Digite um valor")));
        }
        if ( 10 > valor.size()){// .size() traz a quantidade
            JOptionPane.showMessageDialog(null,"A "+(10- valor.size())+" repitidos !!!");
        }

    }
}
