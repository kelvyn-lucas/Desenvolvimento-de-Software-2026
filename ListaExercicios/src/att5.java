import java.util.Scanner;

public class EstatisticaSalarial {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // 1. Definição da quantidade de funcionários
        System.out.print("Quantos funcionários a empresa possui? ");
        int totalFuncionarios = input.nextInt();

        // Criamos o array com o tamanho exato informado
        double[] salarios = new double[totalFuncionarios];
        double somaSalarios = 0;

        // 2. Leitura dos salários e cálculo da soma total
        for (int i = 0; i < totalFuncionarios; i++) {
            System.out.print("Digite o salário do funcionário " + (i + 1) + ": R$ ");
            salarios[i] = input.nextDouble();
            somaSalarios += salarios[i];
        }

        // 3. Cálculo da média
        double media = 0;
        if (totalFuncionarios > 0) {
            media = somaSalarios / totalFuncionarios;
        }

        // 4. Contagem de funcionários acima da média
        int acimaDaMedia = 0;
        for (int i = 0; i < totalFuncionarios; i++) {
            if (salarios[i] > media) {
                acimaDaMedia++;
            }
        }

        // 5. Exibição dos resultados
        System.out.println("\n--- Relatório Estatístico ---");
        System.out.printf("Média salarial da empresa: R$ %.2f\n", media);
        System.out.println("Funcionários com salário acima da média: " + acimaDaMedia);
        System.out.println("-----------------------------");

        input.close();
    }
}
