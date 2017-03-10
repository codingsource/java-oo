/**
 * Empresa
 */
public class Empresa {
    private String nome;
    private String cnpj;
    private Funcionario[] empregados;
    private int contador;

    public  String getNome() {
        return this.nome;
    }

    public  String getCnpj() {
        return this.cnpj;
    }
    public  int getcontador() {
        return this.contador;
    }

    public Empresa(String nome, String cnpj) {
        this.nome = nome;
        this.cnpj = cnpj;
        this.empregados = new Funcionario[5];
        this.contador = 0;
    }

    void mostra() {
        System.out.println("Empresa: " + this.nome);
        System.out.println("CNPJ: " + this.cnpj);

        for (int i = 0; i < this.empregados.length; i++) {
            if (this.empregados[i] != null) {
                this.empregados[i].mostra();
                System.out.println("\n");
            }
        }
    }

    void adiciona(Funcionario f) {
        this.empregados[this.contador] = f;
        this.contador++;
    }
}