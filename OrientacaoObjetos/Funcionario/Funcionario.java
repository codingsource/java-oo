import java.text.DateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * Funcionario
 */
public class Funcionario {
    private static int id;
    private  String nome;
    private  String departamento;
    private  String dataAdmissao;
    private  String rg;
    private  boolean estaNaEmpresa;
    private  double salario;

    public String getId() {
        return this.id;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDepartamento() {
        return this.departamento;
    }

    public void setDepartamento(String departamento){
        this.departamento = departamento;
    }

    public String getDataAdmissao() {
        return this.dataAdmissao;
    }

    public void setDataAdmissao() {
        this.dataAdmissao = this.DataAtual();
    }

    public String getRg() {
        return this.rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public double getSalario() {
        return this.salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public boolean getEstaNaEmpresa() {
        return this.estaNaEmpresa;
    }

    public void setEstaNaEmpresa(boolean estaNaEmpresa) {
        this.estaNaEmpresa = estaNaEmpresa;
    }

    public Funcionario(String nome, String departamento, String rg, boolean estaNaEmpresa, double salario) {
        super();
        this.id = this.id + 1;
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

    public void getGanhoAnual() {
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