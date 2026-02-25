package nivel1;
import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Digite seu nome: ");
            String nome = sc.nextLine();
            
            System.out.println("Olá, " + nome + "! Seja bem-vindo ao Java.");
        }
    }
}