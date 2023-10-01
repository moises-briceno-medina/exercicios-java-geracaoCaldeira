package aula01;//Crie um programa em Java que peça ao usuário para inserir uma temperatura
// em graus Celsius e, em seguida,
// converta essa temperatura em graus Fahrenheit usando a fórmula:
// Fahrenheit = (Celsius * 9/5) + 32. Exiba o resultado na tela.
import aula01.utils.ScanUtils;
public class Exercicio10 {
    public static void main(String[] args) {
        ScanUtils scan = new ScanUtils();

        double tempCelsius = scan.coletaInt("Insira a temperatura em graus celsius: ");
        double tempFahrenheit = (tempCelsius * 9/5) + 32;

        System.out.println("A temperatura convetida em graus Fahrenheit é: " + tempFahrenheit);
    }
}
