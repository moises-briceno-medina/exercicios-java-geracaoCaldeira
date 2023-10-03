package aula05.exercicio04;

import utils.ScanUtils;

import java.util.ArrayList;
import java.util.List;

import static aula05.exercicio04.imputUtils.inputIndiceUtilsCompra.inputIndice;

public class ListaDeCompra {
    public static void main(String[] args) {
        ScanUtils scan = new ScanUtils();
        List<Compra> listaDeCompra = new ArrayList<>();
        int opcao = 0;

        while (opcao != 4) {
            System.out.printf("""
                     Escolha uma das opcoes!
                    1 -> Adicionar compra.
                    2 -> Remover compra
                    3 -> Exibir todas as compras.
                    4 -> Fechar o programa
                    """);
            opcao = scan.coletaInt("");

            switch (opcao) {
                case 1:
                    adicionarItem(listaDeCompra, scan);
                    break;
                case 2:
                    if (verificaCompra(listaDeCompra)) {
                        removerCompra(listaDeCompra, scan);
                    }
                    break;
                case 3:
                    if (verificaCompra(listaDeCompra)) {
                        exibirLista(listaDeCompra);
                    }
                    break;
                case 4:
                    System.out.println("Fechadno o Programa");
                default:
                    System.out.println("Opção inválida.");
            }
        }
    }

    public static void adicionarItem(List<Compra> lista, ScanUtils scan) {
        String nome = scan.coletaTexto("Informe o nome da compra ");
        double valor = scan.coletaDouble("Qual é ovalor da compra ");
        String data = scan.coletaTexto("Informe a data de validade use dd/mm/aaaa ");

        Compra newLista = new Compra(nome, valor, data);
        lista.add(newLista);
    }

    public static void removerCompra(List<Compra> list, ScanUtils scan) {
        list.remove(inputIndice(list, scan));
    }

    public static void exibirLista(List<Compra> lista) {
        System.out.println("Compras adicionadas");
        for (Compra compra : lista) {
            System.out.println(compra);
        }
    }

    public static boolean verificaCompra(List<Compra> lista) {
        if (!lista.isEmpty()) {
            return true;
        } else
            System.out.println("Lista de compras vazia");
        return false;
    }
}
