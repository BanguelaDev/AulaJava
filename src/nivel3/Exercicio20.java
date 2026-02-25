package nivel3;
import java.util.Scanner;

public class Exercicio20 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            double n1 = sc.nextDouble();
            double n2 = sc.nextDouble();
            char op = sc.next().charAt(0);
            
            double resultado;
            
            switch (op) {
                case '+' -> resultado = n1 + n2;
                case '-' -> resultado = n1 - n2;
                case '*' -> resultado = n1 * n2;
                case '/' -> resultado = n1 / n2;
                default -> {
                    System.out.println("Operação inválida");
                    sc.close();
                    return;
                }
            }
            
            System.out.println("Resultado: " + resultado);
        }
    }
}