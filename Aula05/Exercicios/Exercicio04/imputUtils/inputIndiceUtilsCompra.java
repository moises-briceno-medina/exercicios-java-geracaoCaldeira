package Aula05.Exercicios.Exercicio04.imputUtils;

import Aula05.Exercicios.Exercicio04.Compra;
import Aula05.Exercicios.utils.ScanUtils;

import java.util.List;

public class inputIndiceUtilsCompra {
    public static int inputIndice(List<Compra> listaCompras, ScanUtils scan){
        int indice;
        do {
            indice = scan.coletaInt("Informe o indice da Compra que deseja remover de 0 a " + (listaCompras.size() - 1));
        }while (indice < 0 || indice >= listaCompras.size());
        return indice;
    }
}
