package estacionamento;

import java.util.List;
import java.util.ArrayList;

public class Carro {
    public String placa;
    public String modelo;
    public int horaEntrada;
    public int horaSaida;
    public int tempoEstacionado;

    public Carro(String placa, String modelo, int horaEntrada, int horaSaida){
        this.placa = placa;
        this.modelo = modelo;
        this.horaEntrada = horaEntrada;
        this.horaSaida = horaSaida;
        this.tempoEstacionado = horaSaida - horaEntrada;
    }

}

class Ticket {
    private List<Carro> carrosEstacionados = new ArrayList<>();

    public void entrarCarro(Carro carro) {
        carrosEstacionados.add(carro);
    }

    public void sairCarro(Carro carro){
        carrosEstacionados.remove(carro);
        System.out.println("Valor a pagar para o carro de placa " + carro.placa + ": R$" + calcularValor(carro.tempoEstacionado));
    }

    public double calcularValor(int tempoEstacionado){
        return tempoEstacionado * 10;
    }
}

class Aplicacao {
    public static void main(String[] args){
        Carro meuCarro = new Carro("FJB4E12", "CR-V EXL 2.0 16V 4WD/2.0 Flexone Aut.", 18, 24);
        Ticket novoTicket = new Ticket();
        novoTicket.entrarCarro(meuCarro);
        novoTicket.sairCarro(meuCarro);
    }
}