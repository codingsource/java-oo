package OrientacaoObjetos.carro;

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

        Motor motor = new Motor(1500, "107 / 109");

        meuCarro.motor = motor;

        System.out.println("Cor: " + meuCarro.cor);
        System.out.println("Modelo: " + meuCarro.modelo);
        System.out.println("Velocidade atual: " + meuCarro.velocidadeAtual);
        System.out.println("VElocidade maxíma: " + meuCarro.velocidadeMaxima);
        System.out.println("Potência: " + meuCarro.motor.potencia);
        System.out.println("Tipo: " + meuCarro.motor.tipo);

    }
}