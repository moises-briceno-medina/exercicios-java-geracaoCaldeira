package Aula03.exercicios.exercicio02;

public class Circulo {
    private double raio;
    private double cordenadaX;
    private double cordenadaY;

    public Circulo(double raio, double x, double y) {
        this.raio = raio;
        this.cordenadaX = x;
        this.cordenadaY = y;
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

    public void calcularDiametro() {
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

    //Exibindo uma representação em texto do círculo, incluindo o raio, a área e a circunferência.
    @Override
    public String toString() {
        return "Um círculo é uma figura geométrica fundamental na matemática e na geometria. \nEle é caracterizado por várias propriedades importantes, incluindo seu raio, área e circunferência. \n" +
                "Raio:\n" +
                "O raio de um círculo é a distância do centro do círculo até qualquer ponto na sua borda. \nO símbolo comumente usado para representar o raio é \"r\". O raio é uma medida crucial, pois define o tamanho do círculo. \n" +
                "Área:\n" +
                "A área de um círculo é a quantidade de espaço contida dentro de sua borda.\n" +
                "Circunferência:\n" +
                "A circunferência de um círculo é o comprimento da sua borda. \n "
                ;
    }
    // Exibindo a representação do círculo
//    @Override
//    public String toString() {
//        return String.format(Locale.US, "Círculo com centro em (%.2f, %.2f) e raio %.2f", cordenadaX, cordenadaY, raio);
//    }

    //getter
    public double getRaio() {
        return raio;
    }
}
