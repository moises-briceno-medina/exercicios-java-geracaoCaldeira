import utils.ScanUtils;

//Crie um programa que determine e escreva os números primos compreendidos entre um intervalo fornecido pelo usuário.
public class Exercio01 {
    public static void main(String[] args) {
        ScanUtils scan = new ScanUtils();

        int inicioIntervalo = 0;
        int fimIntervalo  = 0;

        do {
            inicioIntervalo = scan.coletaInt("Informe o intervalo inicial");
        } while (inicioIntervalo <2);

        do {
            fimIntervalo = scan.coletaInt("Informe o intervalo final");
        }while (fimIntervalo < inicioIntervalo);

        



    }
}
