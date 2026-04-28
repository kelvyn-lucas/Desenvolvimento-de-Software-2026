public class Ave extends Animal{
    private int altura;

    public Ave(){}

    public Ave(String nome, int patas, double velocidade, int localizacao){
        super(nome, patas, velocidade, localizacao); // Atributos da super classe Animal
        this.altura = 0; // Atributo da classe Ave
    }


    public void mover(){
        System.out.println("Ave "+ getNome() +" voando ^ ^ ^ ^ >" );
        int localAtual = getLocalizacao();
        localAtual += 3;
        super.setLocalizacao(localAtual);
        // super.setLocalizacao(super.getLocalizacao() + 3); // versão compacta
    }

    @Override
    public String toString() {
        return "Ave [altura=" + altura + ", toString()=" + super.toString() + "]";
    }


}