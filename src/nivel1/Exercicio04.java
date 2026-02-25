package nivel1;
import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double numero = sc.nextDouble();
        int convertido = (int) numero;

        System.out.println("Valor convertido: " + convertido);

        sc.close();
    }
}