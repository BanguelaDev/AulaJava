package nivel2;
import java.util.Scanner;

public class Exercicio13 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int[] numeros = new int[5];
            int soma = 0;
            
            for (int i = 0; i < numeros.length; i++) {
                numeros[i] = sc.nextInt();
                soma += numeros[i];
            }
            
            System.out.println("Soma: " + soma);
        }
    }
}