//Comentarios de uma unica linha

/*
Comentario
em
bloco
*/

public class DeclarandoVariaveis {
    public static void main (String[] args) {
        int idade;
        idade = 15;

        System.out.println("Idade: " + idade);

        int idadeNoAnoQueVem = idade + 1;

        System.out.println("Idade ano que vem: " + idadeNoAnoQueVem);

        int quatro = 2 + 2;
        int tres = quatro - 1;
        int oito = tres + 5;
        int dezesseis = oito + 8;

        int um = dezesseis % (dezesseis - 1);

        System.out.println("Resto = " + um);
    }
}