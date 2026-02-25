package nivel3;
import java.util.Scanner;
import java.util.Locale;

public class Exercicio16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Locale.setDefault(new Locale("pt", "BR"));

        double salario = sc.nextDouble();

        System.out.printf("R$ %,.2f%n", salario);

        sc.close();
    }
}