package nivel1;
import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            double base = sc.nextDouble();
            double altura = sc.nextDouble();
            
            double area = base * altura;
            
            System.out.println("Área: " + area);
        }
    }
}