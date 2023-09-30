package Aula05.Exercicios.exercicios06.imputUtils;

import Aula05.Exercicios.exercicios06.Reserva;
import Aula05.Exercicios.utils.ScanUtils;

import java.util.LinkedList;

public class inputIndiceUtils {
    public static int inputIndiceReserva(LinkedList<Reserva> listaReservas, ScanUtils scan){
        int indice;
        do {
            indice = scan.coletaInt("Informe o indice da Compra que deseja remover de 0 a " + (listaReservas.size() - 1));
        }while (indice < 0 || indice >= listaReservas.size());
        return indice;
    }
}
