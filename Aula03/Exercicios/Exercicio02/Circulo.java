package Aula03.Exercicios.Exercicio02;

import Aula03.Exercicios.Exercicio01.utils.ScanUtils;

public class Circulo {
    private double raio;

    public Circulo(double raio) {
        this.raio = raio;
    }

    public void calcularArea() {
        if (this.raio >= 0) {
            System.out.println("A área do círculo com base no raio é: " + 3.14 * (this.raio * this.raio));
        }
    }

    public void calcularCircunferencia() {
        if (this.raio >= 0) {
            System.out.println("A circunferencia do círculo com base no raio é: " + 2 * 3.14 * this.raio);
        }
    }

    // tarefas adicionais

    public void definirRaio(double novoRaio) {
        if (novoRaio >= 0) {
            this.raio = novoRaio;
        }
    }

    public void verificarCirculosIguais(Circulo circulo1, Circulo circulo2) {
        if (circulo1.raio >= 0 && circulo2.raio >= 0) {
            if (circulo1.raio == circulo2.raio) {
                System.out.println("Os círculos são iguais");
            } else System.out.println("Os círculos não são iguais");
        }
    }

    public void CalcularDiametro() {
        if (this.raio >= 0) {
            System.out.println("O diâmetro do circulo é: " + 2 * this.raio);
        }
    }

    public void calcularAreaSombreada(Circulo circulo1, Circulo circulo2) {
        if (circulo1.raio >= 0 && circulo2.raio >= 0) {
            double areaCirculoMaior;
            double areaCirculomenor;
            if (circulo1.raio < circulo2.raio) {
                areaCirculomenor = 3.14 * (circulo1.raio * circulo1.raio);
                areaCirculoMaior = 3.14 * (circulo2.raio * circulo2.raio);
            } else {
                areaCirculomenor = 3.14 * (circulo2.raio * circulo2.raio);
                areaCirculoMaior = 3.14 * (circulo1.raio * circulo1.raio);
            }
            System.out.println("A área sombreada dos circulos é: " + (areaCirculoMaior - areaCirculomenor));
        }
    }

    //getter
    public double getRaio() {
        return raio;
    }
}
