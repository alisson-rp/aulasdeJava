import java.util.Arrays;

public class aula04exemplo01 {
    public static void main(String[] args) {
        int[] arrayInteiros = new int[1000];
        // array de ordenação
       for (int i = 1000; i > 0; i--){
            arrayInteiros[arrayInteiros.length - i] = i;
        }

       /* for (int j= 0; j< 1000; j++){
            System.out.println(arrayInteiros[j]);
        }

        boolean estaOrdenado = false;
        while(!estaOrdenado){
            estaOrdenado = true;
            for(int i = 1; i< arrayInteiros.length; i++){
                if(arrayInteiros[i - 1] > arrayInteiros[i]){
                    estaOrdenado = false;
                    int aux = arrayInteiros[i];
                    arrayInteiros[i] = arrayInteiros[i - 1];
                    arrayInteiros[i - 1] = aux;
                }
            }
        }*/
       /* long inicio = System.currentTimeMillis();
            Arrays.sort(arrayInteiros);
        long fim = System.currentTimeMillis();
        System.out.println("Esse processo levou "
                    +(fim-inicio)+"ms para ser executado!");
        for (int j= 0; j< 1000; j++){
            System.out.println(arrayInteiros[j]);
        }*/

        char[] arrayChar = {'C','F','D','A','B'};
            Arrays.sort(arrayChar);
        for (int x= 0; x< arrayChar.length; x++){
            System.out.println(arrayChar[x]);
        }
    }
}
