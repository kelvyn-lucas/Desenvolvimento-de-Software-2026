import javax.swing.JOptionPane;

public class DoWhile {
    public static void main(String[] args){
       int num1 = 0;
         while(num1 < 10){
            System.out.print(" - "+(num1++));
         }

        int num3 = 0, soma2 = 0;
         do{
            num3 = Integer.parseInt(JOptionPane.showInputDialog(null,"Valor?"));
            soma2 += num3;
         }while(num3 > 0);
                System.out.println("soma total: "+ soma2);
                 
    }
}


