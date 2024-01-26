package org.example;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SumCalculatorTest {
    private SumCalculator sumCalculator;

    @BeforeEach
     void setUp() {
        sumCalculator = new SumCalculator();
    }

    @Test
     void testSumWithNumberOne() {
        int expectedResult = 1;
        int actualResult = sumCalculator.sum(1);
        assertEquals(expectedResult, actualResult);
    }

    @Test
   void testSumWithNumberThree() {
        int expectedResult = 6;
        int actualResult = sumCalculator.sum(3);
        assertEquals(expectedResult, actualResult);
  }

      @Test
     void testSumWithNumberZero() {
        int numberZero = 0;
        assertThrows(IllegalArgumentException.class, () -> sumCalculator.sum(numberZero));
    }
}
