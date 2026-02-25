package nivel3;
import java.util.Scanner;

public class Exercicio18 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            double soma = 0;
            
            for (int i = 0; i < 4; i++) {
                soma += sc.nextDouble();
            }
            
            double media = soma / 4;
            boolean aprovado = media >= 7;
            
            System.out.println("Média: " + media);
            System.out.println("Aprovado: " + aprovado);
        }
    }
}