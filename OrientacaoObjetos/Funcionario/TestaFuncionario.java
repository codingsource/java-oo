import java.text.DateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * TestaFuncionario
 */
public class TestaFuncionario {
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();
        Date data = c.getTime();
        DateFormat f = DateFormat.getDateInstance(DateFormat.MEDIUM);

        Funcionario funcionario = new Funcionario("Peter", "Fabrica de Software", f.format(data), "9.999.999", true, 3000.0);

        funcionario.bonifica(750.23);

        System.out.println("Salário atual: " + funcionario.salario);
        System.out.println("Salário anual: " + funcionario.calculaGanhoAnual());

    }
}