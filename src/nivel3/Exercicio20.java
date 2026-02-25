package nivel3;
import java.util.Scanner;

public class Exercicio20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double n1 = sc.nextDouble();
        double n2 = sc.nextDouble();
        char op = sc.next().charAt(0);

        double resultado = 0;

        switch (op) {
            case '+':
                resultado = n1 + n2;
                break;
            case '-':
                resultado = n1 - n2;
                break;
            case '*':
                resultado = n1 * n2;
                break;
            case '/':
                resultado = n1 / n2;
                break;
            default:
                System.out.println("Operação inválida");
                sc.close();
                return;
        }

        System.out.println("Resultado: " + resultado);

        sc.close();
    }
}