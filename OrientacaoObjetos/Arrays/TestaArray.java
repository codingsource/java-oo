/**
 * TestaArray
 */
public class TestaArray {
    public static void main(String[] args) {
        int [] idades = new int[10];
        idades[5] = 10;

        int i = 0;
        for (int idade : idades) {
            System.out.println("Posição[" + i + "] ==>> Idade: " + idade);
            i++;
        }
    }
}