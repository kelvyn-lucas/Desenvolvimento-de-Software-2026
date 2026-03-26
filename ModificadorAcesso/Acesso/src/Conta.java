public class Conta {
    private static int numero;
    private String nome;
    private double saldo;
    private double limite;

    //setters e getters 

    public void setNumero(int numero){
        this.numero = numero;
    }

    public int getNumero(){
        return this.numero;
    }

    public void setNome(String nome){
        if(nome != null && nome.length() > 1){
            this.nome = nome;
        }
    }

    public String getNome(){
         return this.nome;
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

    public double setLimite(){
        return this.limite;
    }
    

    //Metodo
    public void saque(double valor){
        if(saldo >= valor && valor > 0){
        System.out.println("Saque efetuado com sucesso!");
        //this.saldo = this.saldo - valor;
        this.saldo -= valor;
    }else{
        System.out.println("Saldo insuficiente ou valor de saque invalido");
    }
    System.out.println("Seu saldo atual é: "+ this.saldo);
    }

public boolean sacarVerifica(double quantidade){
    if (quantidade > this.saldo){
        return false;   
    }else{
        double novoSaldo = this.saldo - quantidade;
        this.saldo = novoSaldo;
        return true;
    }
}










//metodo padrão para visualizar cada objeto

public String toString(){
    return " | Nome: " + this.nome + "\n | Numero da conta: " + this.numero + "\n | Saldo: " + this.saldo + "\n | Limite: " + this.limite;
}

public boolean depositarVerificar(double deposito){
    if(deposito <= 0){
        return false;
    }else{
        this.saldo += deposito;
    }
 }

 }