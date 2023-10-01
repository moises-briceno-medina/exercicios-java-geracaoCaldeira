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
        TreeMap<Contatos, String> AgendaTelefonica = new TreeMap<>();

    }

    public static void adicionarContatos(TreeMap<String, String> contatos, ScanUtils scan){
        String nome = scan.coletaTexto("Digite o nome para associar ao número telefone:");
        String numeroTelefone = scan.coletaTexto("Digite o número de telefone:");
        String localidade = scan.coletaTexto("Digite sua localidade (norte, sul, centro, leste e oeste):");
        String endereco = scan.coletaTexto("Digite o endereço:");

        Contatos newAgenda = new Contatos(nome,numeroTelefone,endereco,localidade);
        contatos.put(nome, numeroTelefone);
        System.out.println("contato adicionado com sucesso");
    }

    public static void imprimirListaDeContato(TreeMap<Contatos, String> agendaTelefonica){
        System.out.println("Lista em ordem alfabética");
        for (Map.Entry< Contatos, String> entry : agendaTelefonica.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }

    public static boolean verificaListaVazia(TreeMap<String, String> agendaTelefonica){
        if (!agendaTelefonica.isEmpty()){
            return true;
        }else
            System.out.println("Lista de contatos vazia");
        return false;
    }


}
