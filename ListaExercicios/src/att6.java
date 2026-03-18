import java.util.Scanner;

public class AnalisadorPrimos {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // 1. Definição do tamanho do array
        System.out.print("Quantos números deseja inserir no array (X)? ");
        int x = input.nextInt();
        int[] numeros = new int[x];

        // 2. Preenchimento do array
        for (int i = 0; i < x; i++) {
            System.out.print("Digite o " + (i + 1) + "º número: ");
            numeros[i] = input.nextInt();
        }

        // 3. Definição do limite de exibição N
        System.out.print("Quantos números primos do array você deseja exibir (N)? ");
        int n = input.nextInt();

        System.out.println("\n--- Resultado da Análise ---");
        int contagemPrimosEncontrados = 0;

        for (int i = 0; i < x; i++) {
            // Paramos se já imprimimos N primos
            if (contagemPrimosEncontrados == n) {
                break;
            }

            // Chamada do módulo de verificação
            if (isPrimo(numeros[i])) {
                System.out.println("O número " + numeros[i] + " é primo.");
                contagemPrimosEncontrados++;
            }
        }

        if (contagemPrimosEncontrados == 0) {
            System.out.println("Nenhum número primo foi encontrado no array.");
        } else if (contagemPrimosEncontrados < n) {
            System.out.println("(Apenas " + contagemPrimosEncontrados + " primos estavam presentes no array)");
        }

        input.close();
    }

    /**
     * Módulo que verifica se um número é primo.
     * @param num O número a ser testado
     * @return true se for primo, false caso contrário
     */
    public static boolean isPrimo(int num) {
        if (num <= 1) return false; // Números menores ou iguais a 1 não são primos
        if (num == 2) return true;  // 2 é o único primo par
        if (num % 2 == 0) return false; // Elimina todos os outros pares

        // Verificamos divisores ímpares de 3 até a raiz quadrada do número
        for (int i = 3; i <= Math.sqrt(num); i += 2) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
