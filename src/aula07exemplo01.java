import java.math.BigDecimal;

public class aula07exemplo01 {
    public static void main(String[] args) {
        BigDecimal bigDecimal = BigDecimal.valueOf(2.8989);
        System.out.println(bigDecimal);
        System.out.println("subtração");
        BigDecimal subtracao = BigDecimal.valueOf(2.00)
                .subtract(BigDecimal.valueOf(1.2));
        System.out.println("Resultado: "+ subtracao);

        System.out.println("Soma");
        BigDecimal soma = BigDecimal.valueOf(2.00)
                .add(BigDecimal.valueOf(1.2));
        System.out.println("Resultado "+soma);

        System.out.println("Divisão");
        BigDecimal divisao = BigDecimal.valueOf(2.00)
                .divide(BigDecimal.valueOf(1.2),BigDecimal.ROUND_UP);
        System.out.println("Resultado "+divisao);

        System.out.println("Multiplicação");
        BigDecimal multiplicacao = BigDecimal.valueOf(2.00)
                .multiply(BigDecimal.valueOf(1.2));
        System.out.println("Resultado "+multiplicacao);

        System.out.println("Potênciação");
        BigDecimal potencia = BigDecimal.valueOf(2.00)
                .pow(2);
        System.out.println("Resultado "+potencia);

        System.out.println("Maximo");
        System.out.println(new BigDecimal("2.00").max(new BigDecimal("1.5")));

        System.out.println("Minimo");
        System.out.println(new BigDecimal("2.00").min(new BigDecimal("1.6")));

        System.out.println("Compara");
        System.out.println(new BigDecimal("2.00").compareTo(new BigDecimal("1")));
    }
}
