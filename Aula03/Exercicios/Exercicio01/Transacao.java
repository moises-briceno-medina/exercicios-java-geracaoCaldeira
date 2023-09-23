package Aula03.Exercicios.Exercicio01;

import java.util.Date;

public class Transacao {

    private Date data;
    private String tipo;
    private double valor;

    public Transacao(Date data, String tipo, double valor) {
        this.data = data;
        this.tipo = tipo;
        this.valor = valor;
    }

    @Override
    public String toString() {
        return "Data = " + data + ", Tipo = " + tipo + ", Valor = " + valor;
    }
}
