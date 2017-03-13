package OrientacaoObjetos.banco;

/**
 * Programa
 */
public class Programa {
    public static void main(String[] args) {
        Conta minhaConta;
        minhaConta = new Conta();

        System.out.println("_________________________________________\n\n");

        Cliente cliente = new Cliente("Peter", "Thomas", "123.456.789-10", 27);
        minhaConta.titular = cliente;

        System.out.println("Nome: " + cliente.getNome() + "\nSobrenome: " + cliente.getSobrenome() + "\n");


        // Cliente cliente = new Cliente();
        // minhaConta.titular = cliente;
        // minhaConta.titular.nome = "Duke";
        
        System.out.println(minhaConta.titular.getNome());
    }
}