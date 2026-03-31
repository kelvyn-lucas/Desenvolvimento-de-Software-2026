import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        Scanner teclado = new Scanner(System.in);
        Caculadora calculo = new Caculadora();

        System.out.print("Digite um numero: ");
        calculo.setNum1(teclado.nextDouble());
        System.out.print("digite outro numero: ");
        calculo.setNum2(teclado.nextDouble());
        
        System.out.println("Soma: " + calculo.getNum1() + calculo.getNum2());
    
    
    }
}
