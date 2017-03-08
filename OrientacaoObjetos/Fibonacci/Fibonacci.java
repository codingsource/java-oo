/**
 * Fibonacci
 */
public class Fibonacci {

    long calculaFibonacci (int sequencia) {
        if (sequencia < 2) {
            return sequencia;
        } else {
            return calculaFibonacci(sequencia - 1) + calculaFibonacci(sequencia - 2);
        }
    }
}
