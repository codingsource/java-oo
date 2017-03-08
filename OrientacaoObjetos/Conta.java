/**
 * Conta
 */
public class Conta {

    int numero;
    String dono;
    double saldo;
    double limite;

    boolean saque(double quantidade) {
        if (this.saldo < quantidade) {
            return false;
        } else {
            this.saldo = this.saldo - quantidade;
            return true;
        }
    }

    void deposita(double quantidade) {
        this.saldo += quantidade;
    }

    void tranfere (Conta destino, double valor) {
        this.saldo = this.saldo - valor;
        destino.saldo += valor;
    }
}