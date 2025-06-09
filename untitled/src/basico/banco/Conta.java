package basico.banco;

public class Conta {
    private final int num_conta;
    private String titular;
    private double balanco;


    public Conta(int num_conta, String titular, double valor_inicial){
        this.num_conta = num_conta;
        this.titular = titular;
        this.balanco = valor_inicial;
    }

    public int getNum_conta(){
        return num_conta;
    }

    public String getTitular(){
        return titular;
    }
    public void setTitular(String titular){
        this.titular = titular;
    }

    public double getBalanco(){
        return balanco;
    }

    public void mostrarConta(){
        System.out.printf("Dados da conta:\nConta %d, Titular: %s, Balanço: R$%.2f\n",
                this.getNum_conta(), this.getTitular(), this.getBalanco());
    }

    public void realizarDeposito(double novo_deposito){
        this.balanco += novo_deposito;
    }

    public void realizarSaque(double novo_saque){
        this.balanco -= (novo_saque + 5);
    }
}
