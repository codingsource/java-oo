/**
 * If_Else
 */
public class IfElse {
    public static void main(String[] args) {
        boolean condicaoBooleana = true;
        if (condicaoBooleana) {
            System.out.println("Verdade");
        }

        int idade = 15;
        if (idade < 18) {
            System.out.println("Não pode entrar");
        }else {
            System.out.println("Pode entrar");
        }

        boolean amigoDoDono = true;
        if (idade < 18 & !amigoDoDono) {
            System.out.println("Não pode entrar");
        } else {
            System.out.println("Pode entrar");
        }
    }
}