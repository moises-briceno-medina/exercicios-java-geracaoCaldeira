package Aula05.Exercicios.exercicios06;

public class Reserva {
    private String nome;
    private String local;
    private String cpf;
    private int idReserva;
    private String dataEntrada;
    private String dataSaida;

    public Reserva(String nome, String local, String cpf, String dataEntrada, String dataSaida) {
        this.nome = nome;
        this.local = local;
        this.cpf = cpf;
        this.dataEntrada = dataEntrada;
        this.dataSaida = dataSaida;
        this.idReserva = (int) (Math.random() * 10) + 1;
    }

    @Override
    public String toString() {
        return  "nome: " + nome +
                ", Id de reserva: " + idReserva +
                ", local: " + local +
                ", cpf:" + cpf +
                ", data de entrada: " + dataEntrada +
                ", data de saida: " + dataSaida
                ;
    }

    public int getIdReserva() {
        return idReserva;
    }
}
