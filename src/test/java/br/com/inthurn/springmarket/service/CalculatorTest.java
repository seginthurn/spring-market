package br.com.inthurn.springmarket.service;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {

    @Test
    public void shouldReturnTheSumOfTwoValues(){
//        Integer result;
        Calculator calculator = new Calculator();
//        result = calculator.sum(10,20);

        assertEquals(30, calculator.sum(10,20));


    }

}
