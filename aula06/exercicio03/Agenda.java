//Exercício 3: TreeMap com agenda
//Crie um programa Java que utilize uma estrutura de dados do tipo TreeMap
// para criar uma agenda telefônica. Agenda deve conter: número de telefone,
// nome, endereço e local da cidade (norte, sul, centro, leste e oeste).
// Associe nomes a números de telefone e, em seguida, imprima a lista de
// contatos em ordem alfabética e imprima os contatos com base na localidade.
package aula06.exercicio03;

public class Agenda {
    private int numeroDeTelefono;
    private String nome;
    private String endereco;
    private String localDaCidade;

    public Agenda(int numeroDeTelefono, String nome, String endereco, String localDaCidade) {
        this.numeroDeTelefono = numeroDeTelefono;
        this.nome = nome;
        this.endereco = endereco;
        this.localDaCidade = localDaCidade;
    }
}
