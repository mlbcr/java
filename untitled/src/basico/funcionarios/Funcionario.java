package basico.funcionarios;

public class Funcionario {
    private final int cod_func;
    private String nome_func;
    private double salario;

    public Funcionario(int cod_func, String nome_func, double salario){
        this.cod_func = cod_func;
        this.nome_func = nome_func;
        this.salario = salario;
    }

    public int getCod_func(){
        return cod_func;
    }

    public String getNome(){
        return nome_func;
    }
    public void setNome(String nome_func){
        this.nome_func = nome_func;
    }

    public double getSalario(){
        return salario;
    }

    public void aumentarSalario(double aumento) {
        this.salario += this.salario * (aumento/100);
    }

    public void descontarFaltas(int dias) {
        this.salario -= (dias * 50);
    }

    public void mostrarFuncionario(){
        System.out.printf("Dados do funcionário:\nCódigo %d, Nome: %s, Salário: R$%.2f\n", cod_func, nome_func, salario);
    }
}
