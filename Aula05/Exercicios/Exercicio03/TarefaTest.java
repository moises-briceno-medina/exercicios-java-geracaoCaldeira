package Aula05.Exercicios.Exercicio03;

import Aula05.Exercicios.utils.ScanUtils;

import java.util.ArrayList;
import java.util.List;

public class TarefaTest {
    public static void main(String[] args) {
        ScanUtils scan = new ScanUtils();
        List<Tarefa> armazenaTarefa = new ArrayList<>();
    }

    public void adicionartarefa(List<Tarefa> listaTarefas, ScanUtils scan) {
        String nome = scan.coletaTexto("Informe o nome da tarefa");
        String descricao = scan.coletaTexto("Informe a descricao da tarefa");
        String data = scan.coletaTexto("Informe a data da tarefa use dia/mes/ano");

        Tarefa newTarefa = new Tarefa(nome, descricao, data);
        listaTarefas.add(newTarefa);

        System.out.println("Tarefa criada!!");
    }

    public void removertarefas(List<Tarefa> listaTarefas){

    }

    public void exibirTarefas(List<Tarefa> listaTarefas) {
        System.out.println("Tarefas adicionadas");
        for (Tarefa tarefa : listaTarefas) {
            System.out.println(tarefa);
        }
    }
    public boolean verificaTarefas(List<Tarefa> listaTarefas) {
        if (!listaTarefas.isEmpty()) {
            System.out.println("Nenhuma tarefa encontrada.");
            return true;
        } else
            System.out.println("Lista de tarefas vazia");
        return false;
    }
}