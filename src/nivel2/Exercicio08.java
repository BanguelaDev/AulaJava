package nivel2;
import java.util.Scanner;

public class Exercicio08 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            String nome = sc.nextLine();
            int idade = sc.nextInt();
            double altura = sc.nextDouble();
            
            System.out.printf("Nome: %s%nIdade: %d%nAltura: %.2f%n", nome, idade, altura);
        }
    }
}