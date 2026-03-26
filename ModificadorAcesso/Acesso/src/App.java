import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Conta conta1 = new Conta();

        System.out.print("Qual é o seu nome? ");
        String n = teclado.next(); // lendo do teclado
        conta1.setNome(n); // usando set
         System.out.println("O seu nome é: " + conta1.getNome()); // atributo privado 

        conta1.setNumero(2); // public
        

        Conta conta2 = new Conta();

        conta2.setNumero(5);
        System.out.println(conta1.toString());
        System.out.println(conta2.toString());
        

        // System.out.println("O seu nome é: " + conta1.toString());
        

        teclado.close();

    }
}
