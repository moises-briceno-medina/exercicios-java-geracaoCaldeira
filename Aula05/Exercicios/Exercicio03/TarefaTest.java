package Aula05.Exercicios.Exercicio03;

public class TarefaTest {
    public static void main(String[] args) {

        Tarefa tarefa1 = new Tarefa("Comida","Fazer o almoço");
        Tarefa tarefa2 = new Tarefa("Ropa","Comprar ropa");
        Tarefa tarefa3 = new Tarefa("Musica","Treinar a musica");
        Tarefa tarefa4 = new Tarefa("Casa","Arrumar a casa");
        Tarefa tarefa5 = new Tarefa("Carro","Lavar o carro");
        Tarefa tarefa6 = new Tarefa("Cachorro","passear o cachorro");
        Tarefa tarefa7 = new Tarefa("Escola","Estudar para a prova");

        tarefa1.adicionartarefa(tarefa1);
        tarefa1.adicionartarefa(tarefa7);
        tarefa1.adicionartarefa(tarefa4);
        tarefa1.adicionartarefa(tarefa2);

        tarefa1.removertarefa(tarefa2);


        tarefa1.exibirTarefas();


    }
}
