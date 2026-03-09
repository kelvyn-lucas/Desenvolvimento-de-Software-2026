public class Exercicios{
    public static void main(String args[]){

        int i = 10;
        int j = 20;
        int x = 0;
        int y = 0;
        j++;
        System.out.println(j);
        
        ++i;
        System.out.println(i);
        
        x = i++ + j;
        System.out.println(x);

        y = ++j + ++i;
        System.out.println(y);


    }
}