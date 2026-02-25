package nivel2;
import java.util.Scanner;

public class Exercicio14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String numeroTexto = sc.nextLine();
        Integer numero = Integer.parseInt(numeroTexto);

        System.out.println("Convertido: " + numero);

        sc.close();
    }
}