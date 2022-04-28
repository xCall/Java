import java.util.Locale;

public class App {
    public static void main(String[] args) {
        int idade = 32;
        double renda = 1501.4532;
        String nome = "Maria";
        Locale.setDefault(Locale.US);
        System.out.printf("%s tem %d anos e ganha R$ %.2f reais%n", nome, idade, renda);
    }
}
