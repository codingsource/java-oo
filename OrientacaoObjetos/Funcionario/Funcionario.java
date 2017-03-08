/**
 * Funcionario
 */
public class Funcionario {
    String nome;
    String departamento;
    String dataAdmissao;
    String rg;
    boolean estaNaEmpresa;
    double salario;
    public Funcionario (String nome, String departamento, String dataAdmissao, String rg, boolean estaNaEmpresa, double salario) {
        super();
        this.nome = nome;
        this.departamento = departamento;
        this.dataAdmissao = dataAdmissao;
        this.rg = rg;
        this.estaNaEmpresa = estaNaEmpresa;
        this.salario = salario;
    }

    void bonifica(double aumento) {
        this.salario += aumento;
    }

    double calculaGanhoAnual () {
        double salarioAnual = this.salario * 12;
        return salarioAnual;
    }

    void demite () {

    }
}