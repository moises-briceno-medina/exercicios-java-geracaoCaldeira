package aula05.exercicios.exercicio04.imputUtils;

import Aula05.exercicios.utils.ScanUtils;
import aula05.exercicios.exercicio04.Compra;

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
