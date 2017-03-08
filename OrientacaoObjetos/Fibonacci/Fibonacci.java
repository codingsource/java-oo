/**
 * Fibonacci
 */
public class Fibonacci {

    long calculaFibonacci (int sequencia) {
       return (sequencia < 2) ? sequencia : calculaFibonacci(sequencia - 1) + calculaFibonacci(sequencia - 2);
    }
}
