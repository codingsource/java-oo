import java.text.DateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * Funcionario
 */
public class Funcionario {
    private  String nome;
    private  String departamento;
    private  String dataAdmissao;
    private  String rg;
    private  boolean estaNaEmpresa;
    private  double salario;

    public String getNome() {
        return this.nome;
    }

    public String getDepartamento() {
        return this.departamento;
    }

    public String getDataAdmissao() {
        return this.dataAdmissao;
    }

    public String getRg() {
        return this.rg;
    }

    public double getSalario() {
        return this.salario;
    }

    public boolean getEstaNaEmpresa() {
        return this.estaNaEmpresa;
    }

    public Funcionario(String nome, String departamento, String rg, boolean estaNaEmpresa, double salario) {
        super();
        this.nome = nome;
        this.departamento = departamento;
        this.dataAdmissao = this.DataAtual();
        this.rg = rg;
        this.estaNaEmpresa = estaNaEmpresa;
        this.salario = salario;
    }

    String DataAtual() {
        Calendar c = Calendar.getInstance();
        Date data = c.getTime();
        DateFormat f = DateFormat.getDateInstance(DateFormat.MEDIUM);

        return f.format(data);
    }

    void bonifica(double aumento) {
        this.salario += aumento;
    }

    double calculaGanhoAnual() {
        double salarioAnual = this.salario * 12;
        return salarioAnual;
    }

    void demite() {
        if (this.estaNaEmpresa) {
            this.estaNaEmpresa = false;
        }
    }

    void mostra() {
        System.out.println("Nome: " + this.nome);
        System.out.println("rg: " + this.rg);
        System.out.println("Departamento: " + this.departamento);
        System.out.println("Data admissão: " + this.dataAdmissao);
        System.out.println("Salário: " + this.salario);

        if (this.estaNaEmpresa) {
            System.out.println("Estado atual: Empregado");
        } else {
            System.out.println("Estado atual: Desempregado");
        }

    }
}