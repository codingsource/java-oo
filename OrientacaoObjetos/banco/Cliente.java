/**
 * Cliente
 */
public class Cliente {
    String nome;
    String sobrenome;
    String cpf;    

    public Cliente (String nome, String sobrenome, String cpf) {
        super();
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.cpf = cpf;
    }

     public void mudaCPF(String cpf) {
        if (this.idade <= 60) {
            validaCPF(cpf);
        }
        this.cpf = cpf;
    }

    private void validaCPF(String cpf) {

    }
}