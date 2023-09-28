package Aula05.Exercicios.Exercicio04.imputUtils;

import Aula05.Exercicios.Exercicio03.Tarefa;
import Aula05.Exercicios.Exercicio04.Compra;
import Aula05.Exercicios.utils.ScanUtils;

import java.util.List;

public class inputIndiceUtils {
    public static int inputIndice(List<Compra> listaTarefas, ScanUtils scan){
        int indice;
        do {
            indice = scan.coletaInt("Informe o indice da Compra que deseja remover de 0 a " + (listaTarefas.size() - 1));
        }while (indice < 0 || indice >= listaTarefas.size());
        return indice;
    }
}
