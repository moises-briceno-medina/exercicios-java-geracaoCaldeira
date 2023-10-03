//Exercício 2: HashMap com pessoas
//Crie um programa Java que utilize uma estrutura de dados do tipo HashMap
// para associar nomes a idades. Insira algumas entradas no mapa e,
// em seguida, acesse e imprima a idade de um nome específico.
// Crie um método para imprimir nomes das pessoas que estão na terceira idade.
// Certifique-se de lidar com o caso em que o nome não está presente no mapa.
package aula06.exercicio02;

import utils.ScanUtils;

import java.util.HashMap;

public class Exercicio02 {
    public static void main(String[] args) {
        ScanUtils scan = new ScanUtils();
        HashMap<String, Integer> mapAssociarPessoa = new HashMap<>();

        int opcao = 0;

        while (opcao != 4) {
            opcao = scan.coletaInt("""
                    1 -> Adicionar Pessoa
                    2 -> Vizualizar idade por nome especifico
                    3 -> Visualizar Pessoas de terceira idade
                    4 -> Sair
                    Escolha uma opcao:
                    """);

            switch (opcao) {
                case 1:
                    adicionarMap(mapAssociarPessoa, scan);
                    break;
                case 2:
                    if (vericarMapVazio(mapAssociarPessoa)) {
                        imprimirIdadePoeNome(mapAssociarPessoa, scan);
                    }
                    break;
                case 3:
                    if (vericarMapVazio(mapAssociarPessoa)) {
                        imprimirNomesComTerceiraIdade(mapAssociarPessoa);
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

    public static void adicionarMap(HashMap<String, Integer> hashMap, ScanUtils scan) {
        String nome = scan.coletaTexto("Digite o nome da pessoa");
        int idade = scan.coletaInt("Digite a idade da pessoa");

        Pessoa newPessoa = new Pessoa(nome, idade);
        hashMap.put(newPessoa.getNome(), newPessoa.getIdade());
        System.out.println("Nova pessoa adicionada no map");
    }

    public static void imprimirIdadePoeNome(HashMap<String, Integer> mapimprimeIdade, ScanUtils scan) {
        String nome = scan.coletaTexto("Digite o nome da pessoa que deseja acessar a idade");
        if (mapimprimeIdade.containsKey(nome)) {
            System.out.println("A idade da pessoa " + nome + " é " + mapimprimeIdade.get(nome) + " anos");
        } else System.out.println("A pessoa " + nome + " não existe no map");
    }

    public static void imprimirNomesComTerceiraIdade(HashMap<String, Integer> mapTerceiraIdade) {
        mapTerceiraIdade.forEach((nome, idade) -> {
            if (idade >= 60 && idade <= 120) {
                System.out.println(nome + " esta na terceira idade com " + idade + " anos.");
            }
        });
    }

    public static boolean vericarMapVazio(HashMap<String, Integer> map) {
        if (!map.isEmpty()) {
            return true;
        } else
            System.out.println("Map Vazio");
        return false;
    }
}
