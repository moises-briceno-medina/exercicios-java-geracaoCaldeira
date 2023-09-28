package Aula05.Exercicios.exercicio05;

import Aula05.Exercicios.utils.ScanUtils;

import java.util.LinkedList;

public class FilaDeImpressao {
    public static void main(String[] args) {
        ScanUtils scan = new ScanUtils();
        LinkedList<Impressao> impressaoLinkedList= new LinkedList<>();


    }

    public static void adicionarImpressao(LinkedList<Impressao> impressao, ScanUtils scan){
        String nome = scan.coletaTexto("Digite o nome da impressaao");
        int numeroPaginas = scan.coletaInt("Digite a quantidades de paginas para impressao");

        Impressao newImpressao = new Impressao(nome,numeroPaginas);
        impressao.add(newImpressao);
    }

    public static void imprimirDocumentosFila(LinkedList<Impressao> impressao){
        System.out.println("Documentos da fila");
        for (Impressao imprimir : impressao ){
            System.out.println(imprimir);
        }
    }
}
