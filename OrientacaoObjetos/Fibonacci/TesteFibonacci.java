/**
 * TesteFibonnaci   
 */
public class TesteFibonacci  {
    public static void main(String[] args) {        
        Fibonacci fibonacci = new Fibonacci();
        
        for (int i =  1; i <= 6; i++) {
            System.out.println(fibonacci.calculaFibonacci(i));
        }
    }
}   