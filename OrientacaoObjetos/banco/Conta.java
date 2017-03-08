/**
 * Conta
 */
public class Conta {

    int numero;
    String dono;
    String cpf;
    double saldo;
    double limite;
    Cliente titular;
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

    boolean tranferePara(Conta destino, double valor) {
        if (!this.saque(valor)) {
            return false;
        } else {
            destino.deposita(valor);
            return true;
        }
    }

}