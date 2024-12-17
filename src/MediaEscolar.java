
import java.util.Scanner;


public class MediaEscolar {

    public static void main(String[] args) {
        getMedia();

    }

    public static void getMedia(){
        Scanner teclado = new Scanner(System.in);

        System.out.println("Por favor adicione a nota de Matematica: ");
        Double nota1 = teclado.nextDouble();
        System.out.println("Por favor adicione a nota de Portugues: ");
        Double nota2 = teclado.nextDouble();
        System.out.println("Por favor adicione a nota de Historia: ");
        Double nota3 = teclado.nextDouble();
        System.out.println("Por favor adicione a nota de Geografia: ");
        Double nota4 = teclado.nextDouble();

        Double result = (nota1 + nota2 + nota3 + nota4)/4;
        String media = getResultado(result);
        System.out.println(media);
    }


    public static String getResultado(Double result) {

        if (result >= 7 && result <= 10){
            return "o Aluno obteve de media " + result + " sendo assim Aprovado!";
        } else if (result >= 5 && result < 7 ) {
            return "o Aluno obteve de media " + result + " sendo assim esta de Recuperação!";
        }else {
           return "o Aluno obteve de media " + result + " sendo assim Reprovado!";
        }
    }
}