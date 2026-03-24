public class Conta {
    int numero;
    String nome;
    double saldo;
    double limite;

//     //Metodo
//     public void saque(double valor){
//         if(saldo >= valor && valor > 0){
//         System.out.println("Saque efetuado com sucesso!");
//         //this.saldo = this.saldo - valor;
//         this.saldo -= valor;
//     }else{
//         System.out.println("Saldo insuficiente ou valor de saque invalido");
//     }
//     System.out.println("Seu saldo atual é: "+ this.saldo);
//     }

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
    return "Nome: " + this.nome + "\n | Num: " + this.numero + "\n | Saldo: " + this.saldo + "\n | Limite: " + this.limite;
}

boolean depositarVerificar(double deposito){
    if(deposito <= 0){
        return false;
    }else{
        this.saldo += deposito;
    }
}

 }
