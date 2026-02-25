package nivel1;
import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double n1 = sc.nextDouble();
        double n2 = sc.nextDouble();
        double n3 = sc.nextDouble();

        double media = (n1 + n2 + n3) / 3;

        System.out.printf("Média: %.2f%n", media);

        sc.close();
    }
}