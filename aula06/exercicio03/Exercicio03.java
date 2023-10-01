//Exercício 3: TreeMap com agenda
//Crie um programa Java que utilize uma estrutura de dados do tipo TreeMap
// para criar uma agenda telefônica. Agenda deve conter: número de telefone,
// nome, endereço e local da cidade (norte, sul, centro, leste e oeste).
// Associe nomes a números de telefone e, em seguida, imprima a lista de
// contatos em ordem alfabética e imprima os contatos com base na localidade.
package aula06.exercicio03;

import aula01.utils.ScanUtils;

import java.util.HashSet;
import java.util.TreeMap;

public class Exercicio03 {
    public static void main(String[] args) {
        ScanUtils scan = new ScanUtils();
        TreeMap<String, String> AgendaTelefonica = new TreeMap<>();

    }

    public static void adicionarContatos(TreeMap<String, String> contatos, ScanUtils scan){
        String nome = scan.coletaTexto("Digite o nome para associar ao número telefone");
        String numeroTelefone = scan.coletaTexto("Digite o número de telefone");

        Contatos newAgenda = new Contatos("(51)981168204", "Moises","av protasio alves","norte");
        contatos.put(nome, numeroTelefone);
        System.out.println("contato adicionado com sucesso");
    }

}
