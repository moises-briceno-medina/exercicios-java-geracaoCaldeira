//Crie um projeto Java utilizando o Maven que contenha uma lista de strings.
// Em seguida, utilize Streams para realizar as seguintes operações:
// a) Conte o número total de strings na lista.
// b) Encontre a string mais longa presente na lista.
// c) Conte quantas vezes cada string aparece na lista e exiba a contagem
// para as 5 strings mais frequentes.
package aula08.testesUnitarios.src.main.java.org.example;

import java.util.Arrays;
import java.util.List;


public class Main {
    public static void main(String[] args) {
        final List<String> listaAnimal = Arrays.asList("cachorro","cachorro","gato","passaro","vaca","porco","gato","elefante","cachorro","vaca","porco","passaro","elefante","dragao","galinha");


        //Conta o número total de strings na lista.
        long count = listaAnimal.stream().count();
        System.out.println("Número total de strings na lista"+count);
        
    }
}