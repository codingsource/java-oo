package OrientacaoObjetos.banco;

/**
 * TestaAlgunsMetodos
 */
public class TestaAlgunsMetodos {
    public static void main(String[] args) {
        //Criando conta
        Conta minhaConta;
        minhaConta = new Conta();
//        minhaConta.titular.setNome("Logan");
//        minhaConta.setTitular("Teste");

        Cliente c = new Cliente("Peter", "Thomas", "9.999.9999", 27);
        minhaConta.setTitular(c);
        String titular = minhaConta.getTitular();

        System.out.println(titular);

        Conta c1 = new Conta();
        c1.deposita(100);
//        c1.titular.setNome("Wolverrine");

        //tem o mesmo comportamento de C1 pois e uma referencia a C1
        Conta c2 =  c1;
        c2.deposita(200);
//        c2.titular.setNome("Xavier");

        Conta c4 = new Conta();
        // c4.tranferePara(c5, 200);
        c4.deposita(100);
//        c4.titular.setNome("Zeca Urubu");

        Conta c5 = new Conta();
        c5.deposita(500);
//        c5.titular.setNome("Leoncio");

        if (c4.tranferePara(c5, 200)) {
            System.out.println("Transferiu!");
        } else {
            System.out.println("Não tranferiu.");
        }

        System.out.println("C4 " + c4.getSaldo());
        System.out.println("C5 " + c5.getSaldo());

        System.out.println("");
        System.out.println("______________________________________________");


        System.out.println("C1 " + c1.getSaldo());
        System.out.println("C2 " + c2.getSaldo());

        c1.deposita(100);
        System.out.println("C1 " + c1.getSaldo());

        c2.saque(200);
        System.out.println("C1 " + c1.getSaldo());
        System.out.println("C2 " + c2.getSaldo());

        //Alterando valores da conta
//        minhaConta.titular.setNome("Petrick");
        minhaConta.deposita(1000.0);

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
        System.out.println(minhaConta.getSaldo());
    }
}