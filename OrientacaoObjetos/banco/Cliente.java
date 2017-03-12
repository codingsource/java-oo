/**
 * Cliente
 */
public class Cliente {
    private String nome;
    private String sobrenome;
    private String cpf;
    private int idade;

    public String getNome () {
        return this.nome;
    }

    public void setNome () {
        this.nome = nome;
    }

     public String getSobrenome () {
        return this.sobrenome;
    }

    public void setSobrenome () {
        this.sobrenome = sobrenome;
    }

     public String getCpf () {
        return this.cpf;
    }

    public void setCpf () {
        this.cpf = cpf;
    }


     public int getIdade () {
        return this.idade;
    }

    public void setIdade () {
        this.idade = idade;
    }

    public Cliente (String nome, String sobrenome, String cpf, int idade) {
        super();
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.cpf = cpf;
        this.idade = idade;
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