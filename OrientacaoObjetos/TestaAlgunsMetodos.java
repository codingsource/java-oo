/**
 * TestaAlgunsMetodos
 */
public class TestaAlgunsMetodos {
    public static void main(String[] args) {
        //Criando conta
        Conta minhaConta;
        minhaConta = new Conta();


        //Alterando valores da conta
        minhaConta.dono = "Petrick";
        minhaConta.saldo = 1000.0;

        //saca R$200
        minhaConta.saque(200);
        
        //deposita R$500
        minhaConta.deposita(500);
        System.out.println(minhaConta.saldo);
    }
}