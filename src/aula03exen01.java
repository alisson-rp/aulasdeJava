import java.util.Scanner;
import java.lang.Math;

public class aula03exen01 {
    public static void main(String[] args) {

        String[] nomes = new String[3];
        String[] sobrenomes = new String[3];
        int[] filhos = new int[3];
        double[] alturas = new double[3];
        double[] pesos = new double[3];


        Scanner s = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {
            System.out.println("Digite o nome da pessoa: ");
            String nome = s.nextLine();
            nomes[i] = nome;

            System.out.println("Digite o sobrenome da pessoa: ");
            String sobrenome = s.nextLine();
            sobrenomes[i] = sobrenome;

            System.out.println("Digite a quantidade de filhos: ");
            int quantidadeFilhos = Integer.parseInt(s.nextLine());
            filhos[i] = quantidadeFilhos;

            System.out.println("Digite o sua altura:");
            alturas[i] = Double.parseDouble(s.nextLine());

            System.out.println("Digite seu peso: ");
            pesos[i] = Double.parseDouble(s.nextLine());



        }

        for (int i = 0; i < 3; i++) {
            System.out.println("A pessoa " + nomes[i] + " "
                    + sobrenomes[i] + " tem " + filhos[i] + " filhos e o seu IMC é "
                    + pesos[i]/Math.pow(alturas[i],2));
        }

    }
}
