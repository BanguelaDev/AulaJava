package nivel1;
import java.util.Scanner;

public class Exercicio07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int idade = sc.nextInt();
        boolean maiorDeIdade = idade >= 18;

        System.out.println(maiorDeIdade);

        sc.close();
    }
}