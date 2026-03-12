// João tem 1,50 metro e cresce 2 centímetros por ano, enquanto Zé tem 1,10
// metro e cresce 3 centímetros por ano. Construa um algoritmo que calcule e
// imprima quantos anos serão necessários para que Zé seja maior que João.


public class Ativiade1 {
    public static void main(String[] args){
        double Joao = 1.50, Ze = 1.10;
        int anos = 0;
        while(Ze <= Joao){
            anos++;
            Ze+=0.3;
            Joao+=0.2;
        }
        System.out.println( anos + " Anos." + " Zé ficou com " + Ze + " metros");
        System.out.println("João ficou com "+ Joao + " Metros");
            
        }

    }

