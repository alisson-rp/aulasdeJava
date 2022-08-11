import java.util.Scanner;

public class aula03exen02 {
    public static void main(String[] args) {
        int[] cedulas = {100, 50, 20, 10, 5, 2, 1};
        int[] numeroscedulas = {0, 2, 2, 2, 0,0,1};
        int quantidadeTotal = 0;
        int reaistotal = 0;
        Scanner s = new Scanner(System.in);

        System.out.println("Digite o valor que você quer sacar: ");
        int valorReais = s.nextInt();

        for (int j = 0; j < cedulas.length; j++) {
             reaistotal += cedulas[j] * numeroscedulas[j];
        }

        if (reaistotal >= valorReais){
            for (int i = 0; i < cedulas.length; i++) {

                if (numeroscedulas[i] > 0 && cedulas[i] <= valorReais) {

                    int quantidadeCedulas = valorReais / cedulas[i];
                    valorReais %= cedulas[i];

                    if (quantidadeCedulas <= numeroscedulas[i]) {
                        System.out.println("Quantidade de cedulas de "
                                + cedulas[i] + ": " + quantidadeCedulas);

                        quantidadeTotal += quantidadeCedulas;
                    } else {

                        int resultado = quantidadeCedulas - numeroscedulas[i];
                        valorReais += (cedulas[i] * resultado);
                        quantidadeCedulas = numeroscedulas[i];
                        System.out.println("Quantidade de cedulas de "
                                + cedulas[i] + ": " + quantidadeCedulas);
                        quantidadeTotal += quantidadeCedulas;
                    }
                }
            }
        }
        if ( valorReais > 0 ){
            System.out.println("##################### AVISO ##################");
            System.out.println("  Caixa sem notas suficientes para o saque!!!");
            System.out.println("##############################################");
        }else {
            System.out.println("Quantidade total: " + quantidadeTotal);
        }
    }
}
