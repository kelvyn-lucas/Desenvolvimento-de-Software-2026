import java.util.Scanner;

public class ConversorTempo {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite o tempo em segundos: ");
        int totalSegundos = input.nextInt();

        // 1. Extrair as horas inteiras
        int horas = totalSegundos / 3600;
        
        // 2. O que sobrar das horas, usamos para calcular os minutos
        int restoSegundos = totalSegundos % 3600;
        int minutos = restoSegundos / 60;

        // 3. O que sobrar dos minutos são os segundos finais
        int segundosfinais = restoSegundos % 60;

        // Exibição formatada (02d garante dois dígitos com zero à esquerda)
        System.out.printf("Tempo formatado: %02d:%02d:%02d\n", horas, minutos, segundosfinais);

        input.close();
    }
}
