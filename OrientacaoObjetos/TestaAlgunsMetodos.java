/**
 * TestaAlgunsMetodos
 */
public class TestaAlgunsMetodos {
    public static void main(String[] args) {
        //Criando conta
        Conta minhaConta;
        minhaConta = new Conta();

        Conta c1 = new Conta();
        c1.deposita(100);

        // tem o mesmo comportamento de C1 pois e uma referencia a C1
        Conta c2 =  c1;
        c2.deposita(200);

        Conta c4 = new Conta();
        Conta c5 = new Conta();

        c4.deposita(500);
        c5.deposita(500);
        c4.tranfere(c5, 200);

        System.out.println("C4 " + c4.saldo);
        System.out.println("C5 " + c5.saldo);
    
        System.out.println("");
        System.out.println("______________________________________________");


        System.out.println("C1 " + c1.saldo);
        System.out.println("C2 " + c2.saldo);

        c1.deposita(100);
        System.out.println("C1 " + c1.saldo);

        c2.saque(200);
        System.out.println("C1 " + c1.saldo);
        System.out.println("C2 " + c2.saldo);

        //Alterando valores da conta
        minhaConta.dono = "Petrick";
        minhaConta.saldo = 1000.0;

        //saca R$2000
        //utlilizando variavel temporaria
        boolean consegui = minhaConta.saque(2000);
        if (consegui) {
            System.out.println("Conseguir sacar.");
        } else {
            System.out.println("Não consegui sacar!");
        }

        //executa o metodo saque se saque for realizado entra no if = true
        if (minhaConta.saque(500)) {
            System.out.println("Conseguir sacar.");
        } else {
            System.out.println("Não consegui sacar!");
        }

        //deposita R$500
        minhaConta.deposita(500);
        System.out.println(minhaConta.saldo);


    }
}