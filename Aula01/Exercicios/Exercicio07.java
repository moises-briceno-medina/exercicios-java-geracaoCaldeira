//Criar para uma empresa de consórcio.
// No teste inicial, você deve perguntar para o usuário a idade dele e o seu salário.
// A pessoa só pode comprar um automóvel se for de maior e ganhar mais de R$ 2.000,00
import utils.ScanUtils;

public class Exercicio07 {
    public static void main(String[] args) {
        ScanUtils scan = new ScanUtils();

        int idadeUsuario =0;
        do {
            idadeUsuario = scan.coletaInt("Informe sua idade: ");
        }while (idadeUsuario <= 0 || idadeUsuario >= 120);

        double salario = scan.coletaDouble("Informe seu salario");

        if (idadeUsuario >= 18 && salario >=2000){
            System.out.println("Você está autorizado para comprar um automóvel");
        }
        if (idadeUsuario >= 18 && salario < 2000){
            System.out.println("Você precisa ter um salário de no minímo 2.000,00 para comprar um automóvel");
        }
        if (idadeUsuario< 18 & salario >= 2000){
            System.out.println("Você precisa ser maior de idade para comprar um automóvel");
        }
    }
}
