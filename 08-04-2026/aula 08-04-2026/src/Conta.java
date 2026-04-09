public class Conta {
    // Atributos da classe
    private double saldo;
    //private String nome;
    private static int numero;
    private double limite;
    private Cliente cliente;

    public Conta(){}
    public Conta(double saldo, double limite, Cliente cliente){
        //this.nome = nome;
        this. saldo = saldo;
        this.limite = limite;
        this.cliente = cliente;
        this.numero++;
    }

    // ESCREVA os getters e setters de todos os atributos
    // public void setNome(String nome){
    //     if(nome != null && nome.length() > 1){
    //         this.nome = nome;
    //     }
    // }

    // public String getNome(){
    //     return this.nome;
    // }

    public void setNumero(int numero){
        this.numero = numero;
    }

    public int getNumero(){
        return this.numero;
    }

    private void setSaldo(double saldo){
        this.saldo = saldo;
    }

    private double getSaldo(){
        return this.saldo;
    }

    public void setLimite(double limite){
        this.limite = limite;
    }
    public double getLimite(){
        return this.limite;
    }

    public Cliente getCliente(){
        return this.cliente;
    }

    public void setCliente(Cliente cliente){
        this.cliente = cliente;
    }

    public void saque(double valor){
        if(saldo >= valor && valor >0){
            //this.saldo = this.saldo - valor;
            this.setSaldo(this.saldo -= valor);
            System.out.println("Saque efetuado com sucesso!");
        }else{
            System.out.println("Saldo insuficiente ou valor de saque inválido");
        }
        System.out.println("Seu saldo atual é: "+ this.saldo);
    }

    boolean sacarVerfica(double quantidade){
        if(quantidade > saldo && quantidade <= 0){
            return false;
        }else{
            this.saldo -= quantidade;
            return true;
        }
    }

    // método padrão para visualizar o objeto
    public String toString(){
        return    "\n | Num.: " + this.numero + "\n | Saldo: " + this.saldo + "\n | Limite: " + this.limite + "\n | Cliente: \n\n " + this.cliente.toString();
    }

}

