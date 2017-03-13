package OrientacaoObjetos.Funcionario;

/**
 * Empresa
 */
public class Empresa {
    private String nome;
    private String cnpj;
    private Funcionario[] empregados;
    private static int contador;

    public Empresa(String nome, String cnpj) {
    }

    public String getNome() {
        return this.nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getCnpj() {
        return this.cnpj;
    }
    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }
    public Funcionario getFuncionario(int posicao) {
        return this.empregados[posicao];
    }
    public int getcontador() {
        return this.contador;
    }


    public Empresa(String nome, String cnpj, int qntEmpregados) {
        this.nome = nome;
        this.cnpj = cnpj;
        this.empregados = new Funcionario[qntEmpregados];
        this.contador = this.contador + 1;
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