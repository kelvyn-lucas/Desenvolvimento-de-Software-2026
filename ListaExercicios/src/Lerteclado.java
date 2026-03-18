import java.util.Scanner;
public class Lerteclado {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String captura;
        System.out.print("Digite o seu nome: ");
        captura = teclado.nextLine();
        System.out.println("Ha ha! " + captura);

        teclado.close();
        }
}
