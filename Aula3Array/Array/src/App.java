import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        String meses = {"Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho", "Julho", "Agosto", "Setembro", "Novembro", "Desembro"};
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um numero entre 1 e 12: ");
        int digitado = sc.nextInt();
        // Exiba a qual mês o numero digitado se refere
        
        System.out.println("O mês digitado "+ meses[digitado] +" está na posição 0: ");
        sc.close();
    }
}
