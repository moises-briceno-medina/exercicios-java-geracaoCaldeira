import org.example.OperacaoNumero;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;


public class OperacaoNumeroTest {

    OperacaoNumero operacao = new OperacaoNumero();

    @Test
    @DisplayName("Verifica se o metodo está somando todos os números do Array")
    void somaNumeros() {
        int[] numero = {1, 2, 3, 4};
        assertEquals(10, operacao.somarNumeros(numero));
    }

    @Test
    @DisplayName("verifica se os numeros sao pares")
    void verificaNumeroPar() {
        Assertions.assertTrue(operacao.ehPar(4));
        Assertions.assertTrue(operacao.ehPar(-10));
        Assertions.assertFalse(operacao.ehPar(-5));
        Assertions.assertFalse(operacao.ehPar(3));
    }
    @Test
    @DisplayName("verifica Se fatorial é zero")
    void verificaFatorialDeZero() {
        assertThrows(IllegalArgumentException.class, () -> operacao.calcularFatorial(-1));
        assertEquals(1, operacao.calcularFatorial(0));
        assertEquals(1, operacao.calcularFatorial(1));
        assertEquals(120, operacao.calcularFatorial(5));
    }

    @Test
    @DisplayName("verifica Se String Eh Palindromo")
    void verificaSeStringEhPalindromo(){
        Assertions.assertFalse(operacao.ehPalindromo("moises"));
        Assertions.assertTrue(operacao.ehPalindromo("ana"));
    }

    @Test
    @DisplayName("verifica se a secuencia é fabonacci")
    void verificaSequenciaFabonacci(){
        assertThrows(IllegalArgumentException.class, () -> operacao.calcularFibonacci(-6));
        assertEquals(0, operacao.calcularFibonacci(0));
        assertEquals(1, operacao.calcularFibonacci(1));
        assertEquals(233, operacao.calcularFibonacci(13));
    }
}
