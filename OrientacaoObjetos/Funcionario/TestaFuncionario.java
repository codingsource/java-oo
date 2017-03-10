/**
 * TestaFuncionario
 */
public class TestaFuncionario {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario("Peter", "Fabrica de Software", "9.999.999", true, 3000.0);

        funcionario.bonifica(750.23);

        System.out.println("Salário atual: " + funcionario.salario);
        System.out.println("Salário anual: " + funcionario.calculaGanhoAnual());

        funcionario.estaNaEmpresa = false;  
        funcionario.mostra();
    }
}