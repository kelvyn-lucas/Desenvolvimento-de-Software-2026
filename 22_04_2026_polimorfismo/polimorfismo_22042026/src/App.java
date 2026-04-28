import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);
        int opcao = 0;
        ArrayList<Animal> animaisList = new ArrayList<>();

            System.out.println("\n--- SISTEMA ---");
            System.out.println("1 - Cadastrar Animal");
            System.out.println("2 - Listar Animais");
            System.out.println("3 - Mover Animal");
            System.out.println("4 - Editar Animal");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = teclado.nextInt();
            teclado.nextLine(); // Limpar buffer

            switch (opcao) {
                case 1:
                    Animal a = new Animal("Cachorro", 4, 10.0, 0);
                    animaisList.add(a);
                    System.out.println("Temos "+ animaisList.size() + "Animais cadastrados!");
                   
                    break;

                case 2:
                    System.out.println("digite el qual tipo de agua este peixe vive\n" + "0 - água doce \n1 água salgada");
                    int agua = teclado.nextInt();
                    Peixe p = new Peixe(nome, patas, velocidade, localizacao, agua);

                case 3:
                    Ave ave = new Ave(nome,patas, velocidade, localizacao);
                    animaisList.ddd(ave);
                
                    break;
                case 4:
                   
                    break;

                case 0:
                    System.out.println("Saindo...");
                    break;

                default:
                    System.out.println("Opção inválida!");
            }
        }
        teclado.close();
    }
