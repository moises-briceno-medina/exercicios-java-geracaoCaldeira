package Aula05.Exercicios.Exercicio03;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Tarefa {
    private String titulo;
    private LocalDate data;
    private String descricao;
    List<String> armazenaTarefa = new ArrayList<>();

    public Tarefa(String titulo, String descricao) {
        this.titulo = titulo;
        this.descricao = descricao;
        this.data = LocalDate.now();
    }

    public void adicionartarefa(Tarefa tarefa) {
        armazenaTarefa.add(tarefa.toString());
    }

//    public void removertarefa(Tarefa tarefa) {
//            armazenaTarefa.remove(tarefa);
//        for (String item : armazenaTarefa) {
//            if (tarefa.equals(armazenaTarefa)) {
//                armazenaTarefa.remove(tarefa);
//            }
//        }
//        for (int i = 0; i < armazenaTarefa.size(); i++) {
//            if (tarefa.equals(armazenaTarefa)) {
//                armazenaTarefa.remove(tarefa);
//            }
//        }
//    }

    public void exibirTarefas() {
        if (armazenaTarefa.isEmpty()) {
            System.out.println("Nenhuma tarefa encontrada.");
        } else {
            for (String auxiliar : armazenaTarefa) {
                System.out.println(auxiliar);
            }
        }
    }

    @Override
    public String toString() {
        return "Titulo: " + titulo + ", Descrição: " + descricao + ", Data: " + data; // Personalize como desejar
    }
}
