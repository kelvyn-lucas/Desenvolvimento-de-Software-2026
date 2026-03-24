import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);

        Conta conta1 = new Conta();
        int opcao = 0;
        while(opcao!=5){
        System.out.println("---- SISTEMA BACARIO ----\n");
        System.out.println("Olá Escolha uma opção para continuar:  \n\n | 1. Cadastrar conta \n | 2. Ver dados cadastrados \n | 3. Saque \n | 4. Depósito \n | 5. Sair");
        int menu = teclado.nextInt();
        teclado.nextLine();

        switch (menu) {
            case 1: 
        System.out.print("Digite o nome do cliente: ");
        conta1.nome = teclado.nextLine();
        System.out.print("Digite o numero da conta: ");
        conta1.numero = teclado.nextInt();
        System.out.print("Digite o saldo da conta: ");
        conta1.saldo = teclado.nextDouble();
        System.out.print("Digite o limite: ");
        conta1.limite = teclado.nextDouble();
                    break;
                case 2:
                    System.out.println("----CADASTRO----");
                    System.out.println(conta1.toString());

                    break;
                case 3:
                    System.out.println("---- SAQUE ----");
        System.out.println("Digite o valor de saque");
        double valor = teclado.nextDouble();
        //conta1.saque(valor);

        if (conta1.sacarVerifica(valor)) {
            System.out.println("Saque bem sucedido!");
            System.out.println("Saldo da conta = "+ conta1.saldo +"\n");
        }else{
            System.out.println("Vc é um liso! HA! HA! \n");
        }
                case 4:
                    System.out.println("Digite o valor que queira depositar: ");
                    double deposito = teclado.nextDouble();
                    if(conta1.depositarVerificar(deposito)){
                        System.out.println("Deposito bem sucedido!");
                        System.out.println("Seu saldo é: "+ conta1.saldo);
                    }else{
                        System.out.println("Valor invalido");
                    }

        
            default:
                System.out.println("Opção invalida! digite um numero de 1 a 5. \n");
                break;
        }

    }
        teclado.close();
        
         
    }
}