package Aula05.exercicios.exercicio03;

import Aula05.exercicios.utils.ScanUtils;

import java.util.ArrayList;
import java.util.List;

import static Aula05.exercicios.exercicio03.imputUtils.inputIndiceUtilsTarefa.inputIndice;


public class TarefaTest {
    public static void main(String[] args) {
        ScanUtils scan = new ScanUtils();
        List<Tarefa> armazenaTarefa = new ArrayList<>();
        int opcao = 0;

        while (opcao != 4) {
            System.out.printf("""
                    Escolha uma opcão:
                    1 - Adicionar tarefa
                    2 - Remover tarefa
                    3 - Exibir tarefas
                    4 - Fechar
                    """);
            opcao = scan.coletaInt("");

            switch (opcao) {
                case 1:
                    adicionarTarefa(armazenaTarefa, scan);
                    break;
                case 2:
                    if (verificaTarefas(armazenaTarefa)) {
                        removerTarefas(armazenaTarefa, scan);
                    }
                    break;
                case 3:
                    if (verificaTarefas(armazenaTarefa)) {
                        exibirTarefas(armazenaTarefa);
                    }
                    break;
                case 4:
                    System.out.println("Fechadno o Programa");
            }
        }
    }

    public static void adicionarTarefa(List<Tarefa> listaTarefas, ScanUtils scan) {
        String nome = scan.coletaTexto("Informe o nome da tarefa");
        String descricao = scan.coletaTexto("Informe a descricao da tarefa");
        String data = scan.coletaTexto("Informe a data da tarefa use dia/mes/ano");

        Tarefa newTarefa = new Tarefa(nome, descricao, data);
        listaTarefas.add(newTarefa);

        System.out.println("Tarefa criada!!");
    }

    public static void removerTarefas(List<Tarefa> listaTarefas, ScanUtils scan) {
        listaTarefas.remove(inputIndice(listaTarefas, scan));
        System.out.printf("Tarefa removida!");
    }

    public static void exibirTarefas(List<Tarefa> listaTarefas) {
        System.out.println("Tarefas adicionadas");
        for (Tarefa tarefa : listaTarefas) {
            System.out.println(tarefa);
        }
    }

    public static boolean verificaTarefas(List<Tarefa> listaTarefas) {
        if (!listaTarefas.isEmpty()) {
            return true;
        } else
            System.out.println("Lista de tarefas vazia");
        return false;
    }
}