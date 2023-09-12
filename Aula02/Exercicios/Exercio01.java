import utils.ScanUtils;

//Crie um programa que determine e escreva os números primos compreendidos entre um intervalo fornecido pelo usuário.
public class Exercio01 {
    public static void main(String[] args) {
        ScanUtils scan = new ScanUtils();

        int inicioIntervalo , fimIntervalo , flag = 0;

        do {
            inicioIntervalo = scan.coletaInt("Informe o intervalo inicial");
        } while (inicioIntervalo <2);

        do {
            fimIntervalo = scan.coletaInt("Informe o intervalo final");
        }while (fimIntervalo < inicioIntervalo);

        for (int i = inicioIntervalo ; i <= fimIntervalo; i++){

            for (int j = 2 ; j<i ; j++){
                if (i % j == 0) {
                    flag = 1;
                    j = i;
                }
            }
            if (flag == 0){
                System.out.printf(" %d ", i);
            }else {
                flag = 0;
            }
        }
    }
}
