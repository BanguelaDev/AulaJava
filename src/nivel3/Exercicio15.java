package nivel3;

public class Exercicio15 {
    public static void main(String[] args) {

        String s1 = "Java";
        String s2 = "Java";

        System.out.println("Comparação com ==: " + (s1.equals(s2)));
        System.out.println("Comparação com equals(): " + s1.equals(s2));

        /*
         == compara referência de memória
         equals() compara conteúdo
         */
    }
}