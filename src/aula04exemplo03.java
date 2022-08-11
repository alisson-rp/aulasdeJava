
public class aula04exemplo03 {
    public static void main(String[] args) {
        boolean velha = false;
        String[][] jogoDaVelha;
        jogoDaVelha = new String[3][3];
        jogoDaVelha[0] = new String[]{"X", "O", "X"};
        jogoDaVelha[1] = new String[]{"O", "X", "O"};
        jogoDaVelha[2] = new String[]{"O", "X", "O"};

        // MONTA JOGO DA VELHA
        for (int i = 0; i <jogoDaVelha.length; i++){
            System.out.print("Linha "+i+" :");
            String linha = "";
            for (int j = 0; j < jogoDaVelha[i].length; j++){
                linha += " "+jogoDaVelha[i][j];
            }
            System.out.print(linha+"\n");
        }
        // CHECA CADA LINHA PARA VER SE SÃO TODOS IGUAIS
        for (int i = 0; i < 3; i++) {
            if ((jogoDaVelha[i][0] == jogoDaVelha[i][1]) &&
                    (jogoDaVelha[i][0] == jogoDaVelha[i][2])) {
                System.out.println("o vencedor é "+jogoDaVelha[i][0]);
                velha = true;

            }
        }
        // CHECA CADA COLUNA PARA VER SE SÃO TODOS IGUAIS
        for (int j = 0; j < 3; j++) {
            if ((jogoDaVelha[0][j] == jogoDaVelha[1][j]) &&
                    (jogoDaVelha[0][j] == jogoDaVelha[2][j])) {
                System.out.println("o vencedor é "+jogoDaVelha[0][j]);
                velha = true;
            }
        }
        // CHECA SE NA TRANSVERSAL SÃO TODOS IGUAIS
        if ((jogoDaVelha[0][0] == jogoDaVelha[1][1]) &&
                (jogoDaVelha[0][0] == jogoDaVelha[2][2])) {
            System.out.println("o vencedor é "+jogoDaVelha[0][0]);
            velha = true;
        }
        // CHECA A OUTRA TRANSVERSAL PARA VER SE SÃO TODOS IGUAIS
        if ((jogoDaVelha[0][2] == jogoDaVelha[1][1]) &&
                (jogoDaVelha[0][2] == jogoDaVelha[2][0])) {
            System.out.println("o vencedor é "+jogoDaVelha[0][2]);
            velha = true;
        }
        // SE NADA FOR IGUAL MOSTRA QUE DEU VELHA
        if ( velha == false){
            System.out.println("#################################");
            System.out.println("          DEU VELHA!!!           ");
            System.out.println("#################################");
        }
    }
}