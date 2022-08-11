import java.util.Arrays;

public class aula04exemplo02 {
    public static void main(String[] args) {
        int[] arrayInteiros = new int[10000];
        int numeroPesquisado = 6500;
        //array de pesquisa
        for (int i = 10; i < 10000; i++){
            arrayInteiros[i] = i;
        }

        int i = Arrays.binarySearch(arrayInteiros, numeroPesquisado);

        System.out.println("Encontrado na posição "+i);
    }
}
