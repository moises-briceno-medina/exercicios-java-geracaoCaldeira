package Aula05.Exercicios.Exercicio03.imputUtils;
import Aula05.Exercicios.Exercicio03.Tarefa;
import Aula05.Exercicios.utils.ScanUtils;
import java.util.List;

public class inputIndiceUtilsTarefa {
    public static int inputIndice(List<Tarefa> listaTarefas, ScanUtils scan){
        int indice;
        do {
            indice = scan.coletaInt("Informe o indice da tarefa que deseja remover de 0 a " + (listaTarefas.size() - 1));
        }while (indice < 0 || indice >= listaTarefas.size());
        return indice;
    }
}
