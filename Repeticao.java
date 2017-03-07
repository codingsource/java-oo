/**
 * Repeticao
 */
public class Repeticao {
    public static void main(String[] args) {
        System.out.println("___________WHILE____________________________\n");

        int idade = 15;
        while (idade < 18) {
            System.out.println(idade);
            idade += 1;
        -}

        System.out.println("__________doWhile_____________________________\n");

        int i = 0;
        do {
            System.out.println(i);
            i += 1;
        } while (i <= 10);

        System.out.println("_________For______________________________\n");

        for(int j = 0; j < 10; j = j + 1) {
            System.out.println("Olá");
        }

        System.out.println("Mesmo exemplo utilizando while com contador");
        int k = 0;
        int p = 0;
        while (k < 10) {
            k += 1;
            if (k == 10)System.out.println(k + " += a variavel");
            
            p++;
            if (p == 10)System.out.println(p +  " Icremento");
        }


        System.out.println("_________Break__Controlando__LOOP____________________________\n");

        for (int x = 0; x < 20; x++) {
            if (x % 19 == 0) {
                System.out.println("Achei um número divisível por 19 entre 0 e 20 :P");
                break;
            }
        }

        System.out.println("_________Continue__Controlando__LOOP____________________________\n");
        
        for (int l = 0; l < 100; l++) {
            if (l > 50 && l < 60) {
                continue;
            }
            System.out.println(l);
        }
    }
}