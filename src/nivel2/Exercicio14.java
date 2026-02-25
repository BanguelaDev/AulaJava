package nivel2;
import java.util.Scanner;

public class Exercicio14 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            String numeroTexto = sc.nextLine();
            Integer numero = Integer.valueOf(numeroTexto);
            
            System.out.println("Convertido: " + numero);
        }
    }
}