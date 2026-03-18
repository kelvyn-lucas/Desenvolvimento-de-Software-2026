import java.util.Scanner;

public class VerificaFibonacci {

    public static void main(String[] args) {
        Scanner input = new Scanner(input);
        
        System.out.print("Informe um número inteiro para verificar: ");
        int numeroAlvo = input.nextInt();

        // Inicializamos os dois primeiros termos
        int a = 1;
        int b = 1;

        // Caso especial: o usuário digita 1 (que são os dois primeiros termos)
        if (numeroAlvo == 1) {
            System.out.println("O número 1 pertence à sequência de Fibonacci.");
        } else {
            int proximo = 0;
            
            // Geramos a sequência até alcançar ou ultrapassar o número alvo
            while (proximo < numeroAlvo) {
                proximo = a + b;
                a = b;
                b = proximo;
            }

            // Verificação final
            if (proximo == numeroAlvo) {
                System.out.println("O número " + numeroAlvo + " pertence à sequência de Fibonacci.");
            } else {
                System.out.println("O número " + numeroAlvo + " NÃO pertence à sequência de Fibonacci.");
            }
        }

        input.close();
    }
}
