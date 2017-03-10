import java.text.DateFormat;
import java.util.Calendar;
import java.util.Date;
/**
 * DataTime
 */
public class DataTime {

    Calendar c = Calendar.getInstance();
    Date data = c.getTime();
    DateFormat f;

    public String DataAtual() {
        f = DateFormat.getDateInstance(DateFormat.MEDIUM);
        return this.f.format(this.data);
    }

    public String DataCompleta() {
        f = DateFormat.getDateInstance(DateFormat.FULL);
        return this.f.format(this.data);
    }
}