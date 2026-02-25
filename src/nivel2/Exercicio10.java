package nivel2;
import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            String texto = sc.nextLine();
            
            System.out.println("Quantidade: " + texto.length());
            System.out.println("Maiúsculo: " + texto.toUpperCase());
            System.out.println("Minúsculo: " + texto.toLowerCase());
        }
    }
}