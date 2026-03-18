import java.util.Scanner;

public class RemoveRepetidos {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] numeros = new int[20];

        // 1. Leitura do array de 20 posições
        System.out.println("Digite 20 números inteiros:");
        for (int i = 0; i < 20; i++) {
            System.out.print((i + 1) + "º número: ");
            numeros[i] = input.nextInt();
        }

        System.out.println("\n--- Elementos Únicos (Sem Repetições) ---");

        // 2. Lógica para identificar e imprimir apenas a primeira ocorrência
        for (int i = 0; i < 20; i++) {
            boolean jaApareceu = false;

            // Verificamos se o número atual já existia nas posições anteriores do array
            for (int j = 0; j < i; j++) {
                if (numeros[i] == numeros[j]) {
                    jaApareceu = true;
                    break; // Se encontrou uma cópia atrás, para a busca
                }
            }

            // Se ele não apareceu antes, ele é a "primeira via" ou único
            if (!jaApareceu) {
                System.out.print(numeros[i] + " ");
            }
        }
        
        System.out.println();
        input.close();
    }
}
