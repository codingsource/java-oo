/**
 * TestaConhecimento
 */
public class TestaConhecimento {

    public static void main(String[] args) {

        Pessoa pessoa = new Pessoa("Peter", 27);

        System.out.println(pessoa.nome + "\n" + pessoa.idade);

        pessoa.fazAniversario();

        System.out.println(pessoa.idade);

        System.out.println("__________________________________\n\n");

        Porta porta = new Porta(true, "Mogno", 2.00, 80, 5);;

        porta.mostra();

        porta.aberta = false;

        if (porta.estaAberta()) {
            System.out.println("Porta está aberta");
        } else {
            System.out.println("Porta está fechada");
        }

        System.out.println("__________________________________\n\n");

        Casa casa = new Casa("Laranja", true, false, true);

        casa.pinta("Verde");
        casa.quantasPortasEstaoAbertas();

        casa.mostra();
    }
}