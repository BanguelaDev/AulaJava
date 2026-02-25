package nivel2;
import java.util.Scanner;

public class Exercicio09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String nome1 = sc.nextLine();
        String nome2 = sc.nextLine();

        System.out.println(nome1.equals(nome2));

        sc.close();
    }
}