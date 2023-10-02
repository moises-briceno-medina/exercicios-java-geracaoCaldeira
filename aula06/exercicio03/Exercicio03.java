//Exercício 3: TreeMap com agenda
//Crie um programa Java que utilize uma estrutura de dados do tipo TreeMap
// para criar uma agenda telefônica. Agenda deve conter: número de telefone,
// nome, endereço e local da cidade (norte, sul, centro, leste e oeste).
// Associe nomes a números de telefone e, em seguida, imprima a lista de
// contatos em ordem alfabética e imprima os contatos com base na localidade.
package aula06.exercicio03;

import aula01.utils.ScanUtils;

import java.util.Map;
import java.util.TreeMap;

public class Exercicio03 {
    public static void main(String[] args) {
        ScanUtils scan = new ScanUtils();
        TreeMap<String, Contatos> agendaTelefonica = new TreeMap<>();

        int opcao = 0;

        while (opcao != 4) {
            opcao = scan.coletaInt("""
                    1 -> Adicionar contato
                    2 -> Vizualizar Lista em ordem alfabética
                    3 -> Visualizar por localidade
                    4 -> Sair
                    Escolha uma opcao:
                    """);

            switch (opcao) {
                case 1:
                    adicionarContatos(agendaTelefonica, scan);
                    break;
                case 2:
                    if (verificaListaVazia(agendaTelefonica)) {
                        imprimirListaDeContato(agendaTelefonica);
                    }
                    break;
                case 3:
                    if (verificaListaVazia(agendaTelefonica)) {
                        imprimirListaPorLocalidade(agendaTelefonica, scan);
                    }
                    break;
                case 4:
                    System.out.println("fechando Programa");
                    break;
                default:
                    System.out.println("opção invalida");
            }
        }
    }

    public static void adicionarContatos(TreeMap<String, Contatos> contatos, ScanUtils scan) {
        String nome = scan.coletaTexto("Digite o nome para associar ao número telefone:");
        String numeroTelefone = scan.coletaTexto("Digite o número de telefone:");
        String localidade = scan.coletaTexto("Digite sua localidade (norte, sul, centro, leste e oeste):");
        String endereco = scan.coletaTexto("Digite o endereço:");

        Contatos newContatos = new Contatos(nome, numeroTelefone, endereco, localidade);
        contatos.put(numeroTelefone, newContatos);
        System.out.println("contato adicionado com sucesso");
    }
    
    public static void imprimirListaDeContato(TreeMap<String, Contatos> agendaTelefonica) {
        System.out.println("Lista em ordem alfabética por nome:");
        for (Map.Entry<String, Contatos> entry : agendaTelefonica.entrySet()) {
//            String nome = entry.getKey();
            Contatos contato = entry.getValue();
            System.out.println(contato);
        }
    }

    public static void imprimirListaPorLocalidade(TreeMap<String, Contatos> agendaTelefonica, ScanUtils scan) {
        String localidade = scan.coletaTexto("Digite a localidade que deseja ver (norte, sul, centro, leste e oeste): ");
        for (Map.Entry<String, Contatos> entry : agendaTelefonica.entrySet()) {
            Contatos contatos = entry.getValue();
            if (contatos.getLocalidade().equals(localidade)) {
                System.out.println(entry.getKey() + ": " + contatos);
            }
        }
    }

    public static boolean verificaListaVazia(TreeMap<String, Contatos> agendaTelefonica) {
        if (!agendaTelefonica.isEmpty()) {
            return true;
        } else
            System.out.println("Lista de contatos vazia");
        return false;
    }
}
