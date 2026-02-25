package nivel3;
import java.util.Scanner;

public class DesafioExtra {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Nome: ");
            String nome = sc.nextLine();
            
            int[] numeros = new int[5];
            int soma = 0;
            int maior;
            
            for (int i = 0; i < numeros.length; i++) {
                numeros[i] = sc.nextInt();
                soma += numeros[i];
            }
            
            maior = numeros[0];
            for (int n : numeros) {
                if (n > maior) {
                    maior = n;
                }
            }
            
            double media = soma / 5.0;
            
            System.out.printf("Nome: %s%nMédia: %.2f%nMaior número: %d%n",
                    nome, media, maior);
        }
    }
}