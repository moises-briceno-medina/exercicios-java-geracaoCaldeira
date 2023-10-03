package aula05.exercicio05;

import utils.ScanUtils;

import java.util.LinkedList;

public class FilaDeImpressao {
    public static void main(String[] args) {
        ScanUtils scan = new ScanUtils();
        LinkedList<Impressao> impressaoLinkedList = new LinkedList<>();

        int opcao = 0;

        while (opcao != 3) {
            System.out.printf("""
                     Escolha uma das opcoes!
                    1 -> Adicionar impressão.
                    2 -> Imprimir documentos da lista
                    3 -> Fechar o programa
                    """);
            opcao = scan.coletaInt("");

            switch (opcao) {
                case 1:
                    adicionarImpressao(impressaoLinkedList, scan);
                    break;
                case 2:
                    if (verificarFila(impressaoLinkedList)) {
                        imprimirDocumentosFila(impressaoLinkedList);
                    }
                    break;
                case 3:
                    System.out.println("Fechadno o Programa");
                default:
                    System.out.println("Opção inválida.");
            }
        }

    }

    public static void adicionarImpressao(LinkedList<Impressao> impressao, ScanUtils scan) {
        String nome = scan.coletaTexto("Digite o nome da impressaao");
        int numeroPaginas = scan.coletaInt("Digite a quantidades de paginas para impressao");

        Impressao newImpressao = new Impressao(nome, numeroPaginas);
        impressao.add(newImpressao);
    }

    public static void imprimirDocumentosFila(LinkedList<Impressao> impressao) {
        System.out.println("Documentos da fila");
        for (Impressao imprimir : impressao) {
            System.out.println(imprimir);
        }
    }

    public static boolean verificarFila(LinkedList<Impressao> impressaoList){
        if (!impressaoList.isEmpty()){
            return true;
        }else
            System.out.println("Não tem impressão na lista");
        return false;
    }
}
