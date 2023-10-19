import org.example.Calculadora;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculadoraTest {
   @Test
    void somarNumeros(){
        // Preparação
        Calculadora calculadora = new Calculadora();

        // Ação
        int soma = calculadora.somar(1, 2);

        // Verificação
        Assertions.assertEquals(3, soma);
    }
    @Test
    void subtrairNumeros(){
        // Preparação
        Calculadora calculadora = new Calculadora();

        // Ação
        int subtrair = calculadora.subtrair(2, 1);

        // Verificação
        Assertions.assertEquals(1, subtrair);
    }
    @Test
    void multiplicarNumeros(){
        // Preparação
        Calculadora calculadora = new Calculadora();

        // Ação
        int multiplicar = calculadora.multiplicar(1, 2);

        // Verificação
        Assertions.assertEquals(2, multiplicar);
    }
    @Test
    void dividirNumeros(){
        // Preparação
        Calculadora calculadora = new Calculadora();

        // Ação
        int dividir = calculadora.dividir(4, 2);

        // Verificação
        Assertions.assertEquals(2, dividir);
    }
}
