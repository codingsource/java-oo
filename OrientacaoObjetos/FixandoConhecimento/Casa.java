/**
 * Casa
 */
public class Casa {
    String cor;
    boolean porta1;
    boolean porta2;
    boolean porta3;

    public Casa(String cor, boolean porta1, boolean porta2, boolean porta3) {
        super();
        this.cor = cor;
        this.porta1 = porta1;
        this.porta2 = porta2;
        this.porta3 = porta3;
    }

    void pinta(String corNova) {
        this.cor = corNova;
    }

    void mostra() {
        System.out.println("Cor: " + this.cor);

        if (this.porta1) {
            System.out.println("Porta 1: aberta");
        } else {
            System.out.println("Porta 1: fechada");
        }

        if (this.porta2) {
            System.out.println("Porta 2: aberta");
        } else {
            System.out.println("Porta 2: fechada");
        }

        if (this.porta3) {
            System.out.println("Porta 3: aberta");
        } else {
            System.out.println("Porta 3: fechada");
        }
    }

    void quantasPortasEstaoAbertas() {
        int qntPortasAbertas = 0;
        if (this.porta1) {
            qntPortasAbertas++;
        }
        if (this.porta2) {
            qntPortasAbertas++;
        }
        if (this.porta3) {
            qntPortasAbertas++;
        }

        System.out.println("Quantidade de portas abertas: " + qntPortasAbertas);
    }
}