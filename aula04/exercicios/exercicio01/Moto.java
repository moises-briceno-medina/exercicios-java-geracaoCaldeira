package aula04.exercicios.exercicio01;

public class Moto extends Veiculo {

    @Override
    public void calcularCustoViagem(int distancia) {
        System.out.println("O custo da viagem de moto com base na distância fornecida é: R$"+ distancia * 0.15);
    }
}
