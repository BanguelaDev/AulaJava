package nivel1;
import java.util.Scanner;

public class Exercicio06 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            double celsius = sc.nextDouble();
            double fahrenheit = (celsius * 9/5) + 32;
            
            System.out.println("Fahrenheit: " + fahrenheit);
        }
    }
}