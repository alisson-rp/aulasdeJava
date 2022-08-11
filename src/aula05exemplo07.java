import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class aula05exemplo07 {
    public static void main(String[] args) {
        List<Integer> lista = new ArrayList<>();

        lista.add(3);
        lista.add(8);
        lista.add(7);
        lista.add(1);
        lista.add(2);
        lista.add(4);
        lista.add(9);
        lista.add(10);
        lista.add(5);
        lista.add(6);

       for (Integer text : lista) { // for mais limpo
            System.out.println(text);
        }

        Iterator<Integer> iterator = lista.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
