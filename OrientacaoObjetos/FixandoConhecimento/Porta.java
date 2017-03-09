/**
 * Porta
 */
public class Porta {
    boolean aberta;
    String cor;
    double x;
    double y;
    double z;

    public Porta(boolean aberta, String cor, double x, double y, double z) {
        super();
        this.aberta = aberta;
        this.cor = cor;
        this.x = x;
        this.y = y;
        this.z = z;
    }

    void mostra () {
        if (this.aberta) {
            System.out.println("Porta: Aberta");
        } else {
            System.out.println("Porta: Fechada");
        }

        System.out.println("Cor: " + this.cor);
        System.out.println("Altura: " + this.x);
        System.out.println("Lagura: " + this.y);
        System.out.println("Espessura: " + this.z);
    }

    void abre() {
        this.aberta = true;
    }

    void fecha() {
        this.aberta = false;
    }

    void pinta(String corNova) {
        this.cor = corNova;
    }

    boolean estaAberta() {
        return this.aberta?true:false;
    }
}