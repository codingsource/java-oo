/**
 * Repeticao
 */
public class Repeticao {
    public static void main(String[] args) {
        int idade = 15;

        while (idade < 18) {
            System.out.println(idade);
            idade += 1;
        }

        System.out.println("_______________________________________\n");
        
        int i = 0;
        do {
            System.out.println(i);
            i += 1;
        } while (i <= 10);  
    }
}