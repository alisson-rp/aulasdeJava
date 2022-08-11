import java.math.BigDecimal;

public class aula07exemplo02 {
    public static void main(String[] args) {
        BigDecimal bigDecimal = BigDecimal.valueOf(2.8989);
        System.out.println(bigDecimal.setScale(2,BigDecimal.ROUND_UP));
        System.out.println(bigDecimal.setScale(3,BigDecimal.ROUND_DOWN));
    }
}
