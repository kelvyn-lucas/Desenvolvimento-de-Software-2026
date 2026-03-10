public class Break {
     public static void main(String[] args){
        String nomes[] = {"João", "Maria", "Jose"};
        String procura = "Mateus";
        boolean encontrou = false;
        for(int cont = 0; cont<nomes.length; cont++){
            if(nomes[cont].equals(procura)){
                encontrou = true;
                break;
            }
            System.out.println("Visitamos este lugar");
        }
        if(encontrou)
            System.out.println("Visitamos este lugar");
        else
            System.out.println(procura + " Não encontrado!");
     }
}
