/**
 * TestaEmpresa
 */
public class TestaEmpresa {
    public static void main(String[] args) {

        Empresa e = new Empresa("MinhaEmpresa.net", "68.663.363/0001-40");

        Funcionario f0 = new Funcionario("Cristian Luiz", "Fabrica De Software", "24.213.484", true, 3700.0);
        Funcionario f1 = new Funcionario("Peter Thomas", "Fabrica De Software", "78.534.487", true, 3700.0);
        Funcionario f2 = new Funcionario("Iara Suzana", "Fabrica De Software", "23.334.433", true, 3700.0);
        Funcionario f3 = new Funcionario("Petrick Eduardo", "Fabrica De Software", "14.693.981", true, 3700.0);
        Funcionario f4 = new Funcionario("Amanda Caldas", "Fabrica De Software", "42.789.231", true, 3700.0);

        e.adiciona(f0);
        e.adiciona(f1);
        e.adiciona(f2);
        e.adiciona(f3);
        e.adiciona(f4);

        e.mostra();
    }
}