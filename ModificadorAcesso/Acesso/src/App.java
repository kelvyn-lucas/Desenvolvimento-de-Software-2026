import java.util.Scanner;
public class App {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Conta conta1 = new Conta();
        System.out.println("Qual é o seu nome? "); 
        String n = teclado.next(); // lendo do teclado
        conta1.setNome(n); // usando set
        

        conta1.numero = 2; //public
       //ystem.out.println("O seu nome é: " + conta1.toString());
       System.out.println("O seu nome é: " + conta1.getNome()); // atributo privado privada vaso sanitario fezes

        teclado.close();

    }
}
