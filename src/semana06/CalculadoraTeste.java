package semana06;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class CalculadoraTeste {
    
    @Test
    public void somaDoisNumerosPositivos() {
        
        //Arrange
        double numero1 = 10.0;
        double numero2 = 5.0;

        //act
        double soma = Calculadora.somar(numero1, numero2);

        //Assert - numero esperado e o valor do objeto
        assertEquals(15.0, soma);


    }

    @Test
    public void somaUmNumeroNegativoEUmPositivo() {
    
        double numero1 = 10.0;
        double numero2 = -5.0;

        double soma = Calculadora.somar(numero1, numero2);

        assertEquals(5.0, soma);


    }

    @Test
    public void somaDoisNumerosNegativos() {
    
        double numero1 = -10.0;
        double numero2 = -5.0;

        double soma = Calculadora.somar(numero1, numero2);

        assertEquals(-15.0, soma);


    }

    @Test
    public void subtrairDoisNumerosPositivos() {
    
        double numero1 = 10.0;
        double numero2 = 5.0;

        double subtracao = Calculadora.subtrair(numero1, numero2);

        assertEquals(5.0, subtracao);


    }

    @Test
    public void subtrairDoisNumerosnegativos() {
    
        double numero1 = -10.0;
        double numero2 = -5.0;

        double subtracao = Calculadora.subtrair(numero1, numero2);

        assertEquals(-5.0, subtracao);


    }
    
    @Test
    public void subtrairUmNumeroNegativoEUmPositivo() {
    
        double numero1 = 10.0;
        double numero2 = -5.0;

        double subtracao = Calculadora.subtrair(numero1, numero2);

        assertEquals(15.0, subtracao);


    }


    @Test
    public void multiplicarDoisNumerosPositivos() {
    
        double numero1 = 10.0;
        double numero2 = 5.0;

        double multiplicacao = Calculadora.multiplicar(numero1, numero2);

        assertEquals(50.0, multiplicacao);


    }

    @Test
    public void multiplicarDoisNumerosNegativos() {
    
        double numero1 = -10.0;
        double numero2 = -5.0;

        double multiplicacao = Calculadora.multiplicar(numero1, numero2);

        assertEquals(50.0, multiplicacao);


    }

    @Test
    public void multiplicarUmNumeronegativoEUmPositivo() {
    
        double numero1 = 10.0;
        double numero2 = -5.0;

        double multiplicacao = Calculadora.multiplicar(numero1, numero2);

        assertEquals(-50.0, multiplicacao);


    }

    @Test@Test
    public void dividirDoisNumeros() {
    
        double numero1 = 10.0;
        double numero2 = -5.0;

        double divisao = Calculadora.dividir(numero1, numero2);

        assertEquals(5.0, divisao);


    }
    public void dividirDoisNumerosPositivos() {
    
        double numero1 = 10.0;
        double numero2 = 5.0;

        double divisao = Calculadora.dividir(numero1, numero2);

        assertEquals(2.0, divisao);


    }

    @Test
    public void dividirDoisNumerosNegativos() {
    
        double numero1 = -10.0;
        double numero2 = -5.0;

        double divisao = Calculadora.dividir(numero1, numero2);

        assertEquals(2.0, divisao);


    }

    @Test
    public void dividirUmNumeronegativoEUmPositivo() {
    
        double numero1 = 10.0;
        double numero2 = -5.0;

        double divisao = Calculadora.dividir(numero1, numero2);

        assertEquals(-2.0, divisao);


    }

}
