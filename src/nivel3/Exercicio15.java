package nivel3;

public class Exercicio15 {
    public static void main(String[] args) {

        String s1 = new String("Java");
        String s2 = new String("Java");

        System.out.println("Comparação com ==: " + (s1 == s2));
        System.out.println("Comparação com equals(): " + s1.equals(s2));

        /*
         == compara referência de memória
         equals() compara conteúdo
         */
    }
}