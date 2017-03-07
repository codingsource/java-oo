/**
 * ExercicioFixacaoSintaxe
 */
public class ExercicioFixacaoSitaxe {
    public static void main(String[] args) {

        // 1) Imprima todos os números de 150 a 300.
        System.out.println("1) Imprima todos os números de 150 a 300.");
        int a = 149;
        while (a < 300) {
            a++;
            System.out.println(a);
        }

        System.out.println("___________________________________________\n");

        // 2) Imprima a soma de 1 até 1000.
        System.out.println("2) Imprima a soma de 1 até 1000.");
        int resultado = 0;
        for (int b = 1; b <= 999; b++) {
            resultado = b + 1;
            System.out.println("1 + " + b + " = " + resultado);
        }

        System.out.println("___________________________________________\n");

        // 3) Imprima todos os múltiplos de 3, entre 1 e 100.
        System.out.println("3) Imprima todos os múltiplos de 3, entre 1 e 100.");
        for (int c = 0; c < 101; c++) {
            if (c % 3 == 0) {
                System.out.println(c);
            }
        }

        System.out.println("___________________________________________\n");

        // 4) Imprima os fatoriais de 1 a 10.
        System.out.println("4) Imprima os fatoriais de 1 a 10.");
        long fat = 1;
        int valor = 10;
        System.out.println("Fat " + fat);
        for (int i = 1; i <= valor; i++) {
            fat *= i;
            if (fat < 10) {
                System.out.println(fat);
            }
        }

        System.out.println("___________________________________________\n");

        // 5) Aumente a quantidade de números que terão os fatoriais impressos, até 20, 30, 40. Em um determinado
        // momento, além desse cálculo demorar, vai começar a mostrar respostas completamente erradas. Porque?
        // Mude de int para long, e você poderá ver alguma mudança.
        System.out.println("5) Imprima os fatoriais de 20, 30, 40");
        valor = 40;
        for (int j = 1; j <= valor; j++) {
            fat *= j;
            if (fat <= 40) {
                System.out.println(fat);
            }
        }

        System.out.println("___________________________________________\n");

        // 6) (opcional) Imprima os primeiros números da série de Fibonacci até passar de 100. A série de Fibonacci é a
        // seguinte: 0, 1, 1, 2, 3, 5, 8, 13, 21, etc... Para calculá-la, o primeiro e segundo elementos valem 1, daí por
        // diante, o n-ésimo elemento vale o (n-1)-ésimo elemento somado ao (n-2)-ésimo elemento (ex: 8 = 5 + 3).
        System.out.println("Fibonacci ate 200");

        int n1 = 0;
        int n2 = 1;
        for (int k = 0; k <= 100; k++) {
            n2 = n2 + n1;
            n1 = n2 - n1;
            if (n1 > 0 & n1 <= 200) {
                System.out.println(n1);
            }
        }

        System.out.println("___________________________________________\n");

        // 7) (opcional) Escreva um programa que, dada uma variável x (com valor 180, por exemplo), temos y de acordo
        // com a seguinte regra:
        // se x é par, y = x / 2
        // se x é impar, y = 3 * x + 1
        // imprime y O programa deve então jogar o valor de y em x e continuar até que y tenha o valor final de 1. Por
        // exemplo, para x = 13, a saída será:
        // 40 -> 20 -> 10 -> 5 -> 16 -> 8 -> 4 -> 2 -> 1
        System.out.println("y == 1");

        int x = 13;
        int y = 0;
        while (y == 1) {
            if (x % 2 == 0) {
                y = x / 2;
            }else {
                y = 3 * x + 1;
            }
            System.out.print(y);
        }
    }
}