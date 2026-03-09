import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner banana = new Scanner(System.in); //Inicia o leitor

        System.out.print("Digite um número: "); //Exibe mensagem
        int numero = banana.nextInt(); //Lê do teclado
        System.out.println("O tamanho do seu pênis é "+ numero +"!!"); //exibe o numero digitado

        System.out.println("Digite outro numero: ");
         int numero2 = banana.nextInt();

         int soma = numero + numero2;
         System.out.println("O resultado da soma é "+ soma);






        banana.close(); // Fecha o leitor
    }
}
