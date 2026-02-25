package nivel3;
import java.util.Scanner;

public class Exercicio19 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int idade = sc.nextInt();
            sc.nextLine(); // limpa quebra de linha
            
            String nomeCompleto = sc.nextLine();
            
            System.out.println("Idade: " + idade);
            System.out.println("Nome: " + nomeCompleto);
        }
    }
}