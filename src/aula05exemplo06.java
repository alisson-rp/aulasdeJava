import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class aula05exemplo06 {
    public static void main(String[] args) {
        List<Integer> lista = new ArrayList<>();

        lista.add(3);
        lista.add(8);
        lista.add(7);
        lista.add(1);

        /*System.out.println(lista);
        Collections.sort(lista);// ordena
        System.out.println(lista);*/

       /* for (Integer text : lista) { // for mais limpo
            System.out.println(text);
        }*/

        Iterator<Integer> iterator = lista.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
