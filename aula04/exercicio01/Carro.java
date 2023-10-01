package aula04.exercicio01;

public class Carro extends Veiculo {

    @Override
    public void calcularCustoViagem(int distancia) {
        System.out.println("O custo da viagem de carro com base na distância fornecida é: R$"+  distancia * 0.20);
    }
}
