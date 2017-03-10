/**
 * Conta
 */
public class Conta {

    private int numero;
    private double saldo;
    private double limite;
    private Cliente titular;
    private static int totalDeContas;

    public int geNumero() {
        return this.numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public Double getSaldo() {
        return this.saldo + this.limite;
    }

    public double setLimite(double limite) {
        this.limite = limite;
    }

    public Cliente getTitular() {
        return this.titular;
    }

    public void setTitular(Cliente titular) {
        this.titular = titular;
    }

    public static int totalDeContas() {
        return Conta.totalDeContas;
    }

    public Conta(Cliente titular, int numero, double saldo, double limite) {
        this.totalDeContas = this.totalDeContas + 1;
        super();
        this.titular = titular;
        this.numero = numero;
        this.saldo = saldo;
        this.limite = limite;
    }

    boolean saque(double quantidade) {
        if (this.saldo < quantidade || quantidade > this.saldo + this.limite) {
            System.out.println("Saldo insuficiente");
            return false;
        } else {
            this.saldo = this.saldo - quantidade;
            return true;
        }
    }

    void deposita(double quantidade) {
        if (quantidade % 2 == 0) {
            this.saldo += quantidade;
        }
    }

    boolean tranferePara(Conta destino, double valor) {
        if (!this.saque(valor)) {
            return false;
        } else {
            destino.deposita(valor);
            return true;
        }
    }

}