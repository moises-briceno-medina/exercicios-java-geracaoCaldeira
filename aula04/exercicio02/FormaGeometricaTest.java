package aula04.exercicio02;

import java.util.ArrayList;
import java.util.List;

public class FormaGeometricaTest {
    public static void main(String[] args) {
        List<FormaGeometrica> formas = new ArrayList<>();
        formas.add(new Quadrado(20, "quadrado"));
        formas.add(new Retangulo(7,23, "retangulo"));
        formas.add(new Triangulo(5,10, "triangulo"));

        for (FormaGeometrica forma : formas){
            System.out.println("Área da forma " + forma.getClass().getSimpleName()+ " tem " + String.format("%.2f", forma.calcularArea()));
        }
    }
}
