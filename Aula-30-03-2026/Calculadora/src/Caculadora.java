public class Caculadora {
    private Double num1, num2, soma, menos, multiplicacao, divisao;

    public Double getNum1() {
        return this.num1;
    }

    public void setNum1(Double Num1){
        this.num1 = num1;
    }

      public Double getNum2() {
        return this.num2;
    }

    public void setNum2(Double num2){
        this.num2 = num2;
    }
    
    public Double getSoma() {
        return this.soma;
    }

    public void setSoma(Double soma){
        this.soma = num1 + num2;
    }

    public Double getMenos() {
        return this.menos;
    }

    public void setMenos(Double menos){
        this.menos = num1 - num2;
    }

    public Double getMultiplicacao() {
        return this.Multiplicacao;
    }

    public void setMultiplicacao(Double multiplicacao){
        this.multiplicacao = num1 * num2;
    }

    public Double getDivisao() {
        return this.divisao;
    }

    public void setDivisao(Double Divisao){
        this.divisao = num1 / num2;
    }

}
