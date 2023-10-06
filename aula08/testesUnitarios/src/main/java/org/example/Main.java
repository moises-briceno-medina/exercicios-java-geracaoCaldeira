//Crie um projeto Java utilizando o Maven que contenha uma lista de strings.
// Em seguida, utilize Streams para realizar as seguintes operações:
// a) Conte o número total de strings na lista.
// b) Encontre a string mais longa presente na lista.
// c) Conte quantas vezes cada string aparece na lista e exiba a contagem
// para as 5 strings mais frequentes.
package aula08.testesUnitarios.src.main.java.org.example;

import java.util.*;
import java.util.stream.Collectors;


public class Main {
    public static void main(String[] args) {
        List<String> listaAnimal = Arrays.asList("cachorro", "cachorro", "gato", "passaro","porco", "gato", "elefante", "porco", "passaro", "elefante", "dragao", "galinha");


        //Conta o número total de strings na lista.
        long count = listaAnimal.stream().count();
        System.out.println("Número total de strings na lista " + count);



        //A classe Optional em Java é usada para representar um valor que pode estar presente ou ausente (nulo).
        // Em outras palavras, ela encapsula um valor que pode ou não existir.
        // A principal vantagem do uso de Optional é evitar exceções
        // de "NullPointerException" ao tentar acessar um valor que pode não estar presente.

        //        Encontra a string mais longa presente na lista.[
        Optional<String> longestString = listaAnimal.stream()
                .max((s1, s2) -> s1.length() - s2.length());

        if (longestString.isPresent()){
            System.out.println("A string mais longa é: " + longestString.get());
        }else {
            System.out.println("A lista está vazia.");
        }

        Map<String, Long> contagemStrings = listaAnimal.stream()
                .collect(Collectors.groupingBy(s -> s, Collectors.counting()));

        contagemStrings.entrySet().stream()
                .sorted((entry1, entry2) -> Long.compare(entry2.getValue(), entry1.getValue()))
                .forEach(entry -> System.out.println(entry.getKey() + ": " + entry.getValue()));
    }
}