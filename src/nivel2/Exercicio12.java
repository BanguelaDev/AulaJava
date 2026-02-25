package nivel2;
import java.util.Scanner;

public class Exercicio12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numeros = new int[5];

        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = sc.nextInt();
        }

        int maior = numeros[0];

        for (int n : numeros) {
            if (n > maior) {
                maior = n;
            }
        }

        System.out.println("Maior: " + maior);

        sc.close();
    }
}