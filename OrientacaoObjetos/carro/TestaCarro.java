/**
 * TestaCarro
 */
public class TestaCarro {
    public static void main(String[] args) {
        Carro meuCarro = new Carro("Preto", "Fusca", 0, 80);

        //liga carro
        meuCarro.liga();

        // acelera carro
        meuCarro.acelera(20);
        System.out.println(meuCarro.velocidadeAtual);
    }
}