public class Funcionario {
    String nome;
    String departamento;
    double salario;
    String entrou;
    String rg;
    boolean trabalho;
}

public void setNome(String nome){
        if(nome != null && nome.length() > 1){
            this.nome = nome;
        }
    }

    public String getNome(){
         return this.nome;
    }

    public void setDepartamento(String departamento){
        this.departamento = departamento;
    }

    public String getDepartamento(){
        return this.departamento;
    }

    public void setSalario(double salario){
        this.salario = salario;
    }

    public double getSalario(){
        return this.salario;
    }
