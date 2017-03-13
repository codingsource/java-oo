/**
 * TestaDataTime
 */
public class TestaDataTime {

    public static void main(String[] args) {

        DataTime dt = new DataTime();
        
        System.out.println(dt.dataAtualCompleta());
        System.out.println(dt.dataAtualAbreviada()); 
        System.out.println(dt.dataAtual());  
        System.out.println(dt.dataAtual_()); 
    }
}