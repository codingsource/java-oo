/**
 * Conta
 */
public class Conta {

    private int numero;
    private String dono;
    private String cpf;
    private double saldo;
    private double limite;
    private Cliente titular;

    public int geNumero() {
        return this.numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
    
    public String getDono() {
        return this.dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public String getCpf() {
        return this.cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
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