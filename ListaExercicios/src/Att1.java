import java.util.Scanner;
public class Att1 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String produto;
        System.out.print("Digite o nome do produto: ");
        produto = teclado.nextLine();
        float preco;
        System.out.print("Digite o preço do produto: ");
        preco = teclado.nextFloat();
        int quantidade;
        System.out.print("Digite a quantidade do produto: ");
        quantidade = teclado.nextInt();

        double percentualDesconto = 0;

        if (quantidade <= 10) {
        percentualDesconto = 0;
        } else if (quantidade <= 20) {
            percentualDesconto = 0.10; // 10%
        } else if (quantidade <= 50) {
            percentualDesconto = 0.20; // 20%
        } else {
            percentualDesconto = 0.25; // 25%
        }

        // Cálculos finais
        double valorBruto = preco * quantidade;
        double valorDesconto = valorBruto * percentualDesconto;
        double valorTotal = valorBruto - valorDesconto;

        // Exibição dos resultados
        System.out.println("\n--- Resumo da Compra ---");
        System.out.println("Produto: " + produto);
        System.out.printf("Valor Bruto: R$ %.2f\n", valorBruto);
        System.out.printf("Desconto Aplicado (%.0f%%): R$ %.2f\n", (percentualDesconto * 100), valorDesconto);
        System.out.printf("Valor Total a Pagar: R$ %.2f\n", valorTotal);
        System.out.println("------------------------");

        teclado.close();
    }
}
