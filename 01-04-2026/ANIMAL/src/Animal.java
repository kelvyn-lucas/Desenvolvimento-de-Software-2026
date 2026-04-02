public class Animal {
    private String nome;
    private float peso;
    private int recinto;
    //Construtores

    public Animal(String nome, int recinto){
        this.nome = nome;
        this.recinto = recinto;
    }

    public Animal (){}
    // Getters and Setters
    @Override
    public String toString() {
        return "Animal [nome = " + nome + ", peso = " + peso + ", recinto = " + recinto + "]";
    }

}
